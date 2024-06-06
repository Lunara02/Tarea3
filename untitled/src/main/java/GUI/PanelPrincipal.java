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
}
