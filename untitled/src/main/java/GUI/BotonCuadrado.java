package GUI;

import javax.swing.*;
import java.awt.*;

public class BotonCuadrado extends JButton {
    public BotonCuadrado(String nombre, int x, int y){
        super(nombre);
        this.setPreferredSize(new Dimension(x,y));
    }
}



