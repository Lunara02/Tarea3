package GUI;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Principal");
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        frame.add(panelPrincipal);
        frame.setResizable(false);
        frame.setSize(800, 630);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

