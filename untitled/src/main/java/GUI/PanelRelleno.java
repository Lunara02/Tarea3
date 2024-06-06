package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * La clase PanelRelleno es una extensión de JPanel que define un panel con dimensiones específicas para rellenar.
 */
public class PanelRelleno extends JPanel {
    private Image Dep = null;

    /**
     * Crea una instancia de PanelRelleno con las dimensiones especificadas y la opacidad configurada.
     *
     * @param x el ancho del panel.
     * @param y la altura del panel.
     * @param TF define si el panel es opaco (true) o transparente (false).
     */
    public PanelRelleno(int x, int y, Boolean TF) {
        this.setOpaque(TF);
        this.setPreferredSize(new Dimension(x, y));
    }

    /**
     * Crea una instancia de PanelRelleno con una imagen de fondo y las dimensiones especificadas.
     *
     * @param a la imagen de fondo a ser dibujada.
     * @param x el ancho del panel.
     * @param y la altura del panel.
     */
    public PanelRelleno(Image a, int x, int y) {
        this.setPreferredSize(new Dimension(x, y));
        this.Dep = a;
    }

    /**
     * Dibuja el contenido del panel, incluyendo la imagen de fondo si está definida.
     *
     * @param g el contexto gráfico en el que se dibuja el contenido del panel.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Dep, 0, 0, this);
    }
}
