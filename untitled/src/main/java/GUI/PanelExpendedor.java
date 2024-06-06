package GUI;

import EXPENDEDORA.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PanelExpendedor extends JPanel {
    private Expendedora expendedora;
    private BotonCuadrado CocaCola;
    private BotonCuadrado Sprite;
    private BotonCuadrado Fanta;
    private BotonCuadrado Snickers;
    private BotonCuadrado Super8;
    private JButton cuantoVuelto = new JButton("");
    private Musica musica = new Musica();
    private BotonCuadrado EasterEgg = new BotonCuadrado(null,18,17,1);
    private BotonCuadrado cuantoGanancias = new BotonCuadrado(new ImageIcon(getClass().getClassLoader().getResource("Bocallave.png")), 0,0,0);
    private Registrador registrador = new Registrador("");
    private PanelInformacion panelInformacion;
    private PanelDeposito Deposito;
    private Musica comprar = new Musica();
    private Musica rap = new Musica();
    private JFrame pedro = null;
    private BotonCuadrado Rellenar;
    private FrameDeposito DepVuelto = null;
    private FrameGanancias DepGanancia;
    private int magic = 0;
    private int activable = 0;
}
