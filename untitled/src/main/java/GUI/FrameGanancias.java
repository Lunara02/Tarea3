package GUI;

import EXPENDEDORA.*;
import javax.swing.*;
import java.awt.*;

public class FrameGanancias extends JFrame {
    private PanelRelleno Fondo;
    private Depositos Moneda100;
    private Depositos Moneda500;
    private Depositos Moneda1000;
    private int m100 = 0, m500 = 0, m1000 = 0;
    private Deposito<Moneda> Ganancia;
    public FrameGanancias(String a, Expendedora Ref, Image Dep){
        setResizable(false);
        setSize(314, 180);
        setVisible(true);
        setTitle(a);
        Fondo = new PanelRelleno(Dep,0,0);
        add(Fondo);
        Fondo.setLayout(new BorderLayout());

        PanelRelleno Este = new PanelRelleno(40,0,false);
        Fondo.add(Este, BorderLayout.EAST);

        PanelRelleno Oeste = new PanelRelleno(39,0,false);
        Fondo.add(Oeste, BorderLayout.WEST);

        PanelRelleno Sur = new PanelRelleno(0,39,false);
        Fondo.add(Sur,BorderLayout.SOUTH);

        PanelRelleno Centro = new PanelRelleno(0,0,false);
        Centro.setLayout(new GridLayout(1,3));

        Ganancia = Ref.getmonCompra();

        for(int x = 0; x < Ganancia.getSize(); x++){
            if(Ganancia.getIndexObject(x) instanceof Moneda1000){
                m1000 += 1;
            }
            else if(Ganancia.getIndexObject(x) instanceof Moneda500){
                m500 += 1;
            }
            else if(Ganancia.getIndexObject(x) instanceof Moneda100){
                m100 += 1;
            }
        }

        System.out.println("["+m1000+"]");
        System.out.println("["+m500+"]");
        System.out.println("["+m100+"]");

        Moneda1000 = new Depositos(new ImageIcon(getClass().getClassLoader().getResource("moneda1000.png")), m1000, 12,55,0,8);
        Moneda500 = new Depositos(new ImageIcon(getClass().getClassLoader().getResource("moneda500.png")), m500, 12,55,0,8);
        Moneda100 = new Depositos(new ImageIcon(getClass().getClassLoader().getResource("moneda100.png")), m100, 12,55,0,8);

        Centro.add(Moneda1000);
        Centro.add(Moneda500);
        Centro.add(Moneda100);

        Fondo.add(Centro, BorderLayout.CENTER);
    }
}
