package WebRadioExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Oleg on 29.03.14.
 */
@Component
public class OnlineAudioPlayer {
    @Value("#{playerProperties.songs}")
    private List<String> songs;

    public List<String> getSongs() {
        System.out.println("Songs: "+songs);
        return songs;
    }
    public void forward() {
        System.out.println("Forward");
    }
    public void backward() {
        System.out.println("Backward");
    }

    @CheckedAction
    public void play() {
        System.out.println("Play");
    }
}
