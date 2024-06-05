package GUI;

import javax.swing.*;
import java.awt.*;

public class Registrador extends JLabel {
    public Registrador(String Texto){
        this.setBackground(Color.black);
        this.setText(Texto);
        this.setForeground(Color.GREEN);
        this.setHorizontalAlignment(CENTER);
        this.setOpaque(true);
    }
}
