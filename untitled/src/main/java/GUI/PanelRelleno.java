package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelRelleno extends JPanel {
    private Image Dep = null;
    public PanelRelleno(int x, int y, Boolean TF){
        this.setOpaque(TF);
        this.setPreferredSize(new Dimension(x,y));
    }
    public PanelRelleno(Image a, int  x, int y){
        this.setPreferredSize(new Dimension(x,y));
        this.Dep = a;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Dep,0,0,this);
    }

}
