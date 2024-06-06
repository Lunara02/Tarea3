package GUI;

import javax.sound.sampled.*;
import java.io.IOException;

/**
 * La clase Musica proporciona métodos para reproducir y detener archivos de audio en formato WAV.
 * Utiliza javax.sound.sampled para manejar el audio.
 */
public class Musica {
    private Clip clip;

    /**
     * Reproduce un archivo de audio especificado y puede configurarse para que se repita en bucle.
     *
     * @param s el nombre del archivo de audio (sin la extensión .wav).
     * @param loop si es 1, el audio se reproducirá en un bucle continuo; de lo contrario, se reproducirá una vez.
     */
    public void playMusica(String s, int loop) {
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream(s + ".wav"));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f);
            if (loop == 1) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Detiene la reproducción del archivo de audio si está en ejecución y libera los recursos.
     */
    public void stopMusica() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
}