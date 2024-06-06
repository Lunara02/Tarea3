package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * La clase PintarProducto se encarga de dibujar una imagen en una posición específica dentro de un componente.
 */
public class PintarProducto {
    private ImageIcon Imagen;
    private int x, y;

    /**
     * Crea una nueva instancia de la clase PintarProducto.
     *
     * @param Ruta la ruta del archivo de imagen.
     * @param x la coordenada x.
     * @param y la coordenada y.
     */
    public PintarProducto(ImageIcon Ruta, int x, int y) {
        Imagen = Ruta;
        this.x = x;
        this.y = y;
    }

    /**
     * Dibuja la imagen en las coordenadas especificadas.
     *
     * @param g el contexto gráfico en el que se dibuja la imagen.
     */
    protected void paintComponent(Graphics g) {
        g.drawImage(Imagen.getImage(), x, y, null);
    }
}
