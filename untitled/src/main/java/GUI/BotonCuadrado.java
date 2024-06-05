package GUI;

import javax.swing.*;
import java.awt.*;

public class BotonCuadrado extends JButton {
    public BotonCuadrado(String nombre, int x, int y){
        super(nombre);
        this.setPreferredSize(new Dimension(x,y));
    }
    public BotonCuadrado(ImageIcon nombre, int x, int y, int Relleno){
        super(nombre);
        if(Relleno == 1){
            this.setContentAreaFilled(false);
            this.setFocusPainted(false);
            this.setOpaque(false);
        }
        this.setPreferredSize(new Dimension(x,y));
    }
}



