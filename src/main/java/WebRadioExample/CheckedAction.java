package WebRadioExample;

import java.lang.annotation.*;

/**
 * Created by Oleg on 29.03.14.
 */
@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface CheckedAction {
}
