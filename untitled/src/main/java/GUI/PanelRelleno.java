package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelRelleno extends JPanel {
    private Image Dep = null;
    public PanelRelleno(int x, int y, Boolean TF){
        this.setOpaque(TF);
        this.setPreferredSize(new Dimension(x,y));
    }

}
