package GUI;

import EXPENDEDORA.*;
import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;
    private PanelInformacion panelInformacion;
    private Expendedora expPrincipal = new Expendedora(5);
    private PanelProducto Product = new PanelProducto();
    public PanelPrincipal () {
        panelInformacion = new PanelInformacion();
        panelExpendedor = new PanelExpendedor(expPrincipal, panelInformacion, Product);
        panelComprador = new PanelComprador(expPrincipal, panelInformacion, Product);
        setLayout(new BorderLayout());
        add(panelExpendedor, BorderLayout.CENTER);
        add(panelComprador, BorderLayout.EAST);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
