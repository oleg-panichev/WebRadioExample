package WebRadioExample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Oleg on 29.03.14.
 */
@Aspect
@Component
public class FreeAccountAspect {
    @Value("#{playerProperties.limit}")
    private int limit;

    public FreeAccountAspect() {
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Around("@annotation(CheckedAction)")
    public void afterMethod(ProceedingJoinPoint pjp) throws Throwable {
        if (limit>0) {
            pjp.proceed();
            limit--;
            System.out.println("Aspect "+limit+" free song left");
        } else {
            System.out.println("aspect not allowed operation");
        }
    }
}
