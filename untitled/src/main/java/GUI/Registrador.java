package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * La clase Registrador muestra texto en un panel con un fondo negro y texto verde.
 * @author Sebastian Ignacio Vega Varela
 */
public class Registrador extends JLabel {

    /**
     * Crea una nueva instancia de Registrador con el texto especificado.
     * @param Texto El texto que se mostrará en el Registrador.
     */
    public Registrador(String Texto){
        this.setBackground(Color.black);
        this.setText(Texto);
        this.setForeground(Color.GREEN);
        this.setHorizontalAlignment(CENTER);
        this.setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
