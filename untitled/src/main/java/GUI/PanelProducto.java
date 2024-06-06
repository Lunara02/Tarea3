package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * La clase PanelProducto es una extensión de JPanel que permite dibujar y eliminar imágenes
 * de productos utilizando la clase PintarProducto.
 */
public class PanelProducto extends JPanel {
    PintarProducto Producto = null;

    /**
     * Crea una instancia de PanelProducto con opacidad configurada como falsa.
     */
    public PanelProducto() {
        this.setOpaque(false);
    }

    /**
     * Dibuja un producto en el panel utilizando una imagen especificada.
     *
     * @param Imagen la imagen .
     * @param x la coordenada x.
     * @param y la coordenada y.
     */
    public void PintarProducto(ImageIcon Imagen, int x, int y) {
        Producto = new PintarProducto(Imagen, x, y);
        repaint();
    }

    /**
     * Elimina la imagen del producto del panel.
     */
    public void VaciarProducto() {
        Producto = null;
        repaint();
    }

    /**
     * Dibuja el contenido del panel, incluyendo el producto si está definido.
     *
     * @param g el contexto gráfico en el que se dibuja el contenido del panel.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (Producto != null) {
            Producto.paintComponent(g);
        }
    }
}
