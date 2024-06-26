package GUI;

import EXPENDEDORA.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * La clase PanelComprador es una extensión de JPanel que permite al usuario interactuar con una expendedora,
 * ingresar monedas y consumir productos.
 */
class PanelComprador extends JPanel {
    private Expendedora Comprador;
    private BotonCuadrado moneda100Button;
    private BotonCuadrado moneda500Button;
    private BotonCuadrado moneda1000Button;
    private PanelInformacion panelInformacion;
    private Musica sonido = new Musica();
    private BotonCuadrado queBebiste = new BotonCuadrado("Consumir", 100, 50);
    private Registrador queProducto = new Registrador("");

    /**
     * Crea una instancia de PanelComprador.
     *
     * @param expendedora la expendedora.
     * @param PanelInformacion el panel que muestra la información del crédito y el producto.
     * @param Product el panel que muestra el producto seleccionado.
     */
    public PanelComprador(Expendedora expendedora, PanelInformacion PanelInformacion, PanelProducto Product) {
        queBebiste.setMargin(new Insets(5, 0, 5, 0));
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
            /**
             * Evento para el botón de moneda de 100.
             * Agrega una moneda de 100 a la expendedora, actualiza el crédito y reproduce un sonido.
             *
             * @param e el evento de acción.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Comprador.setMonedaIngresada(new Moneda100());
                panelInformacion.new_credito(Comprador.getDineroIngresado());
                sonido.playMusica("sonido", 0);
            }
        });
        moneda500Button = new BotonCuadrado(iconMoneda500, 100, 50, 1);
        moneda500Button.addActionListener(new ActionListener() {
            /**
             * Evento para el botón de moneda de 500.
             * Agrega una moneda de 100 a la expendedora, actualiza el crédito y reproduce un sonido.
             *
             * @param e el evento de acción.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Comprador.setMonedaIngresada(new Moneda500());
                panelInformacion.new_credito(Comprador.getDineroIngresado());
                sonido.playMusica("sonido", 0);
            }
        });
        moneda1000Button = new BotonCuadrado(iconMoneda1000, 100, 50, 1);
        moneda1000Button.addActionListener(new ActionListener() {
            /**
             * Evento para el botón de moneda de 1000.
             * Agrega una moneda de 100 a la expendedora, actualiza el crédito y reproduce un sonido.
             *
             * @param e el evento de acción.
             */

            @Override
            public void actionPerformed(ActionEvent e) {
                Comprador.setMonedaIngresada(new Moneda1000());
                panelInformacion.new_credito(Comprador.getDineroIngresado());
                sonido.playMusica("sonido", 0);
            }
        });

        queBebiste.addActionListener(new ActionListener() {
            /**
             * Manejador del evento para el botón que consume el producto.
             * Muestra el nombre del producto consumido, reproduce un sonido adecuado,
             * y actualiza el estado de la expendedora y del panel del producto.
             *
             * @param e el evento de acción.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Comprador.getProducto() != null) {
                    queProducto.setText(Comprador.getProducto().sabor());
                    if (Comprador.getProducto() instanceof Bebida) {
                        sonido.playMusica("Beber", 0);
                    }
                    if (Comprador.getProducto() instanceof Dulces) {
                        sonido.playMusica("Crunch", 0);
                    }
                } else {
                    queProducto.setText("Nada");
                }
                Comprador.eliminarProducto();
                Product.VaciarProducto();

            }
        });
        PanelRelleno Norte = new PanelRelleno(0,65,false);
        this.add(Norte,BorderLayout.NORTH);

        PanelRelleno Este = new PanelRelleno(44,0,false);
        this.add(Este,BorderLayout.EAST);

        PanelRelleno Oeste = new PanelRelleno(44,0,false);
        this.add(Oeste,BorderLayout.WEST);

        PanelRelleno Sur = new PanelRelleno(0,340,false);
        Sur.setLayout(new BorderLayout());

        PanelRelleno SurSur = new PanelRelleno(0,200,false);
        Sur.add(SurSur,BorderLayout.SOUTH);

        PanelRelleno SurNorte = new PanelRelleno(0,50, false);
        Sur.add(SurNorte, BorderLayout.NORTH);

        PanelRelleno SurEste = new PanelRelleno(32,0, false);
        Sur.add(SurEste, BorderLayout.EAST);

        PanelRelleno SurOeste = new PanelRelleno(32,0, false);
        Sur.add(SurOeste, BorderLayout.WEST);

        PanelRelleno SurCentro = new PanelRelleno(0,0,false);
        SurCentro.setLayout(new GridLayout(2,1,0,10));
        SurCentro.add(queBebiste);
        SurCentro.add(queProducto);
        Sur.add(SurCentro, BorderLayout.CENTER);

        this.add(Sur,BorderLayout.SOUTH);

        PanelRelleno Centro = new PanelRelleno(0,0,false);
        Centro.setLayout(new GridLayout(3,1,0,7));
        Centro.add(moneda100Button);
        Centro.add(moneda500Button);
        Centro.add(moneda1000Button);
        this.add(Centro,BorderLayout.CENTER);
    }
    /**
     * Sobrescribe el método paintComponent para dibujar una imagen de fondo.
     *
     * @param g el contexto gráfico en el que se dibuja.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("Com.png"))).getImage(), 0,0,this);
    }
}