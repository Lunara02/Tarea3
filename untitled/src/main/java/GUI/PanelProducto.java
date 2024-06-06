package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelProducto extends JPanel {
    PintarProducto Producto = null;
    public PanelProducto(){
        this.setOpaque(false);
    }
    public void PintarProducto(ImageIcon Imagen, int x, int y){
        Producto = new PintarProducto(Imagen, x, y);
        repaint();
    }
    public void VaciarProducto(){
        Producto = null;
        repaint();
    }
    
}
