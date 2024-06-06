package GUI;

import EXPENDEDORA.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class PanelComprador extends JPanel {
    private Expendedora Comprador;
    private BotonCuadrado moneda100Button;
    private BotonCuadrado moneda500Button;
    private BotonCuadrado moneda1000Button;
    private PanelInformacion panelInformacion;
    private Musica sonido = new Musica();
    private BotonCuadrado queBebiste = new BotonCuadrado("Consumir", 100, 50);
    private Registrador queProducto = new Registrador("");

    public PanelComprador(Expendedora expendedora, PanelInformacion PanelInformacion, PanelProducto Product) {
        queBebiste.setMargin(new Insets(5, 0, 5, 0)); // Adjust the insets (top, left, bottom, right)
        queBebiste.setFont(new Font(queBebiste.getFont().getName(), queBebiste.getFont().getStyle(), 12));
        this.setPreferredSize(new Dimension(146, 0));
        this.Comprador = expendedora;
        this.panelInformacion = PanelInformacion;
        this.setLayout(new BorderLayout());

        ImageIcon iconMoneda100 = new ImageIcon(getClass().getClassLoader().getResource("moneda100.png"));
        ImageIcon iconMoneda500 = new ImageIcon(getClass().getClassLoader().getResource("moneda500.png"));
        ImageIcon iconMoneda1000 = new ImageIcon(getClass().getClassLoader().getResource("moneda1000.png"));

        moneda100Button = new BotonCuadrado(iconMoneda100, 100, 50, 1);
        moneda100Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        moneda500Button = new BotonCuadrado(iconMoneda500, 100, 50, 1);
        moneda500Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        moneda1000Button = new BotonCuadrado(iconMoneda1000, 100, 50, 1);
        moneda1000Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        queBebiste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}