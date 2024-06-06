package GUI;

import EXPENDEDORA.*;
import javax.swing.*;
import java.awt.*;

/**
 * PanelPrincipal es un JPanel que sirve como panel principal para la interfaz de usuario de la máquina expendedora.
 * Contiene el PanelExpendedor (panel de la máquina expendedora), PanelComprador (panel del comprador), PanelInformacion (panel de información), PanelProducto (panel que muestra producto) y la expendedora principal
 * @author Sebastian Ignacio Vega Varela
 */
public class PanelPrincipal extends JPanel {
    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;
    private PanelInformacion panelInformacion;
    private Expendedora expPrincipal = new Expendedora(5);
    private PanelProducto Product = new PanelProducto();

    /**
     * Constructor de PanelPrincipal con las configuraciones predeterminadas para crear la interfaz.
     */
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
