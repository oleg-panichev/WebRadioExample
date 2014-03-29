package WebRadioExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        OnlineAudioPlayer player=context.getBean(OnlineAudioPlayer.class);
        player.getSongs();
        player.forward();
        player.play();
        player.forward();
        player.getSongs();
        player.forward();
        player.play();
        player.play();
        player.play();
        player.play();
        player.play();
        player.play();
    }
}
