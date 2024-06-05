package GUI;

import javax.sound.sampled.*;
import java.io.IOException;

public class Musica {
    private Clip clip;

    public void playMusica(String s) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream(s + ".wav"));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}