package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelInformacion extends JPanel {
    private Registrador Credito = new Registrador("Credito: 0");
    private Registrador IngreseProducto = new Registrador("Seleccione producto: ");
    private Registrador Error = new Registrador("");
    public PanelInformacion(){
        setLayout(new GridLayout(3,1));
        add(Credito);
        add(IngreseProducto);
        add(Error);
    }
}
