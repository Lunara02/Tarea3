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
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }
    public void stopMusica() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
}