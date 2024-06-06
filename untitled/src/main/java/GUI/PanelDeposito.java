package GUI;

import EXPENDEDORA.*;
import java.awt.*;
import javax.swing.*;

/**
 * La clase PanelDeposito contiene los diferentes depositos de productos de una expendedora.
 * Muestra los depositos de distintos productos como Coca-Cola, Sprite, Fanta, Snickers y Super8.
 * Ademas, permite manejar los clics del raton para rellenarla cuando se requiera.
 * @author Braian Urra
 */
public class PanelDeposito extends JPanel{
    private Depositos DepCocacola;
    private Depositos DepSprite;
    private Depositos DepFanta;
    private Depositos DepSnickers;
    private Depositos DepSuper8;
    private Expendedora Ref;

    /**
     * Constructor de la clase PanelDeposito.
     * Inicializa los depósitos de productos y los añade al panel.
     *
     * @param exp La referencia a la expendedora que contiene los productos.
     */
    public PanelDeposito(Expendedora exp){
        this.setOpaque(false);
        this.setLayout(new GridLayout(3,2,0,6));
        this.Ref = exp;
        DepCocacola = new Depositos(exp, new ImageIcon(getClass().getClassLoader().getResource("ProCocaCola.png")), 1,48,29);
        DepSprite = new Depositos(exp, new ImageIcon(getClass().getClassLoader().getResource("ProSprite.png")), 2,28,29);
        DepFanta = new Depositos(exp, new ImageIcon(getClass().getClassLoader().getResource("ProFanta.png")), 3,48,36);
        DepSnickers = new Depositos(exp, new ImageIcon(getClass().getClassLoader().getResource("ProSnickers.png")), 4,40,18);
        DepSuper8 = new Depositos(exp, new ImageIcon(getClass().getClassLoader().getResource("ProSuper8.png")), 5,60,24);
        this.add(DepCocacola);
        this.add(DepSprite);
        this.add(DepFanta);
        this.add(DepSnickers);
        this.add(DepSuper8);
    }

    /**
     * Sobrescribe el método paintComponent para dibujar componentes adicionales si es necesario.
     *
     * @param g El contexto gráfico en el que se dibujan los componentes.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    /**
     * Maneja los clics del ratón para verificar el estado de los productos y rellenar la expendedora si es necesario.
     */
    public void handleMouseClick() {
        Producto p = Ref.getProducto();
        int y = Ref.getSizeProducto();
        if(p!=null){
            if(y>=0){
            }
        }
        else{
            System.out.println("RELLENAR");
            Ref.llenarExpendedora();
            DepCocacola = new Depositos(Ref, new ImageIcon(getClass().getClassLoader().getResource("ProCocaCola.png")), 1,48,29);
            DepSprite = new Depositos(Ref, new ImageIcon(getClass().getClassLoader().getResource("ProSprite.png")), 2,28,29);
            DepFanta = new Depositos(Ref, new ImageIcon(getClass().getClassLoader().getResource("ProFanta.png")), 3,48,36);
            DepSnickers = new Depositos(Ref, new ImageIcon(getClass().getClassLoader().getResource("ProSnickers.png")), 4,40,18);
            DepSuper8 = new Depositos(Ref, new ImageIcon(getClass().getClassLoader().getResource("ProSuper8.png")), 5,60,24);
        }
        repaint();
    }
}