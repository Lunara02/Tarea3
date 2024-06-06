package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * La clase BotonCuadrado extiende JButton y permite crear botones con un tamaño específico.
 * Esta clase proporciona dos constructores, uno para botones con texto y otro para botones con imagen.
 * En el constructor con imagen, es posible especificar si el botón debe tener borde y el tipico relleno blanco que tienen.
 * @author Sebastian Ignacio Vega Varela
 */

public class BotonCuadrado extends JButton {

    /**
     * Constructor para crear un BotonCuadrado con un nombre (texto) y dimensiones específicas.
     * @param nombre El texto del botón.
     * @param x La anchura del botón.
     * @param y La altura del botón.
     */
    public BotonCuadrado(String nombre, int x, int y) {
        super(nombre);
        this.setPreferredSize(new Dimension(x, y));
    }

    /**
     * Constructor para crear un BotonCuadrado con un icono, dimensiones específicas y una opción para el relleno.
     * @param nombre El icono del botón.
     * @param x La anchura del botón.
     * @param y La altura del botón.
     * @param Relleno Indica si el botón debe tener relleno (1 para no rellenar, cualquier otro valor para rellenar).
     */
    public BotonCuadrado(ImageIcon nombre, int x, int y, int Relleno) {
        super(nombre);
        if (Relleno == 1) {
            this.setContentAreaFilled(false);
            this.setFocusPainted(false);
            this.setOpaque(false);
        }
        this.setPreferredSize(new Dimension(x, y));
    }
}



