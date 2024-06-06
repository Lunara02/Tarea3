package GUI;

import javax.swing.*;
import java.awt.*;

public class PintarProducto{
    private ImageIcon Imagen;
    private int x, y;
    public PintarProducto(ImageIcon Ruta, int x, int y){
        Imagen = Ruta;
        this.x = x;
        this.y = y;
    }
    protected void paintComponent(Graphics g) {
        g.drawImage(Imagen.getImage(), x, y, null);
    }
}
