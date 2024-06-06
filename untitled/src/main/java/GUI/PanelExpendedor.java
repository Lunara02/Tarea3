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
    public PanelExpendedor(Expendedora expendedora, PanelInformacion panelInformacion, PanelProducto Product) {
        this.expendedora = expendedora;
        this.setLayout(new BorderLayout());
        Deposito = new PanelDeposito(expendedora);
        musica.playMusica("entrada",1);

        CocaCola = new BotonCuadrado(new ImageIcon(getClass().getClassLoader().getResource("cocacola.png")), 50, 50, 0);
        Sprite = new BotonCuadrado(new ImageIcon(getClass().getClassLoader().getResource("sprite.png")), 50, 50, 0);
        Fanta = new BotonCuadrado(new ImageIcon(getClass().getClassLoader().getResource("fanta.png")), 50, 50, 0);
        Snickers = new BotonCuadrado(new ImageIcon(getClass().getClassLoader().getResource("snickers.png")), 50, 50, 0);
        Super8 = new BotonCuadrado(new ImageIcon(getClass().getClassLoader().getResource("super8.png")), 50, 50, 0);

        CocaCola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(expendedora.getDineroIngresado() == 0){
                        expendedora.EliminarMonedaIngresada();
                    }
                    expendedora.ComprarProducto(Productos.COCACOLA);
                    panelInformacion.new_credito(expendedora.getDineroIngresado());
                    registrador.setText("" + expendedora.getVuelto());
                    Deposito.handleMouseClick();
                    Product.PintarProducto(new ImageIcon(getClass().getClassLoader().getResource("ProCocaCola.png")), 8, 32);
                    comprar.playMusica("xd", 0);
                    panelInformacion.LanzarError("");
                    magic = 1;
                } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException ex) {
                    System.out.println(ex);
                    panelInformacion.LanzarError(ex.getMessage());
                    comprar.playMusica("Error",0);
                }
            }
        });

        Sprite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(expendedora.getDineroIngresado() == 0){
                        expendedora.EliminarMonedaIngresada();
                    }
                    expendedora.ComprarProducto(Productos.SPRITE);
                    panelInformacion.new_credito(expendedora.getDineroIngresado());
                    registrador.setText("" + expendedora.getVuelto());
                    Deposito.handleMouseClick();
                    Product.PintarProducto(new ImageIcon(getClass().getClassLoader().getResource("ProSprite.png")), 8, 32);
                    comprar.playMusica("xd", 0);
                    panelInformacion.LanzarError("");
                    magic = 1;
                } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException ex) {
                    System.out.println(ex);
                    panelInformacion.LanzarError(ex.getMessage());
                    comprar.playMusica("Error",0);
                }
            }
        });

        Fanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(expendedora.getDineroIngresado() == 0){
                        expendedora.EliminarMonedaIngresada();
                    }
                    expendedora.ComprarProducto(Productos.FANTA);
                    panelInformacion.new_credito(expendedora.getDineroIngresado());
                    registrador.setText("" + expendedora.getVuelto());
                    Deposito.handleMouseClick();
                    Product.PintarProducto(new ImageIcon(getClass().getClassLoader().getResource("ProFanta.png")), 8, 32);
                    comprar.playMusica("xd", 0);
                    panelInformacion.LanzarError("");
                    magic = 1;
                } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                    System.out.println(ex);
                    panelInformacion.LanzarError(ex.getMessage());
                    comprar.playMusica("Error",0);
                }
            }
        });

        Snickers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(expendedora.getDineroIngresado() == 0){
                        expendedora.EliminarMonedaIngresada();
                    }
                    expendedora.ComprarProducto(Productos.SNICKERS);
                    panelInformacion.new_credito(expendedora.getDineroIngresado());
                    registrador.setText("" + expendedora.getVuelto());
                    Deposito.handleMouseClick();
                    Product.PintarProducto(new ImageIcon(getClass().getClassLoader().getResource("ProSnickers.png")), 19, 12);
                    comprar.playMusica("xd", 0);
                    panelInformacion.LanzarError("");
                    magic = 1;
                } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException ex) {
                    System.out.println(ex);
                    panelInformacion.LanzarError(ex.getMessage());
                    comprar.playMusica("Error",0);
                }
            }
        });

        Super8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(expendedora.getDineroIngresado() == 0){
                        expendedora.EliminarMonedaIngresada();
                    }
                    expendedora.ComprarProducto(Productos.SUPER8);
                    panelInformacion.new_credito(expendedora.getDineroIngresado());
                    registrador.setText("" + expendedora.getVuelto());
                    Deposito.handleMouseClick();
                    Product.PintarProducto(new ImageIcon(getClass().getClassLoader().getResource("ProSuper8.png")), 19, 12);
                    comprar.playMusica("xd", 0);
                    panelInformacion.LanzarError("");
                    magic = 1;
                } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException ex) {
                    System.out.println(ex);
                    panelInformacion.LanzarError(ex.getMessage());
                    comprar.playMusica("Error",0);
                }
            }
        });

        cuantoVuelto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DepVuelto != null) {
                    DepVuelto.dispose();
                }
                DepVuelto = new FrameDeposito("Vuelto", (new ImageIcon(getClass().getClassLoader().getResource("Vuelto.png"))).getImage(), expendedora);
                registrador.setText("" + expendedora.getVuelto());
                panelInformacion.new_credito(expendedora.getDineroIngresado());
                expendedora.EliminarMonedaIngresada();
                panelInformacion.LanzarError("");
                DepVuelto.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                        comprar.playMusica("Cerrar", 0);
                    }
                });
                comprar.playMusica("Abrir",0);
            }
        });

        cuantoGanancias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DepGanancia != null) {
                    DepGanancia.dispose();
                }
                DepGanancia = new FrameGanancias("Ganancia", expendedora, (new ImageIcon(getClass().getClassLoader().getResource("VueltoGan.png"))).getImage());
                DepGanancia.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                        comprar.playMusica("Cerrar", 0);
                    }
                });
                comprar.playMusica("Abrir",0);
            }
        });

        EasterEgg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                activable += 1;
                if (activable == 3) {
                    musica.stopMusica();
                    if (pedro != null) {
                        pedro.dispose();
                        rap.stopMusica();
                    }
                    pedro = new JFrame("?");
                    JLabel thanos = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Botton2.gif")));
                    pedro.add(thanos);
                    pedro.setSize(300, 300);
                    pedro.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            rap.stopMusica();
                            musica.playMusica("entrada",1);
                        }
                    });
                    pedro.setVisible(true);
                    rap = new Musica();
                    rap.playMusica("Rap", 1);
                    activable = 0;
                }
            }
        });

        Rellenar = new BotonCuadrado("", 20, 20);
        Rellenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(magic);
                if (magic == 1) {
                    comprar.playMusica("Magia", 0);
                }
                expendedora.llenarExpendedora();
                Deposito.handleMouseClick();
                magic = 0;
                panelInformacion.LanzarError("");

            }
        });
        PanelRelleno Oeste = new PanelRelleno(115, 0, false);
        PanelRelleno Este = new PanelRelleno(90, 0, false);
        PanelRelleno Sur = new PanelRelleno(0, 63, false);
        PanelRelleno Norte = new PanelRelleno(0, 88, false);

        this.add(Norte, BorderLayout.NORTH);
        this.add(Sur, BorderLayout.SOUTH);
        this.add(Oeste, BorderLayout.WEST);
        this.add(Este, BorderLayout.EAST);

        Norte.setLayout(new BorderLayout());

        PanelRelleno NorteCentro = new PanelRelleno(0,0,false);
        NorteCentro.setLayout(null);
        EasterEgg.setBounds(40,57,18,17);
        NorteCentro.add(EasterEgg);

        Norte.add(NorteCentro,BorderLayout.CENTER);

        PanelRelleno NorteEste = new PanelRelleno(180,0,false);
        NorteEste.setLayout(new BorderLayout());

        PanelRelleno NorteEsteEste = new PanelRelleno(145,0,false);
        NorteEste.add(NorteEsteEste,BorderLayout.EAST);

        PanelRelleno NorteEsteSur = new PanelRelleno(0,50,false);
        NorteEste.add(NorteEsteSur, BorderLayout.SOUTH);

        PanelRelleno NorteEsteOeste = new PanelRelleno(12,0,false);
        NorteEste.add(NorteEsteOeste, BorderLayout.WEST);

        PanelRelleno NorteEsteNorte = new PanelRelleno(0,20,false);
        NorteEste.add(NorteEsteNorte, BorderLayout.NORTH);
        NorteEste.add(Rellenar);
        Norte.add(NorteEste, BorderLayout.EAST);

        PanelRelleno Centro = new PanelRelleno(0, 0, false);
        Centro.setLayout(new BorderLayout());

        PanelRelleno CentroEste = new PanelRelleno(204, 0, false);
        CentroEste.setLayout(new BorderLayout());

        PanelRelleno Depositos = new PanelRelleno(0, 0, false);
        Depositos.setLayout(new BorderLayout());
        PanelRelleno DepositosSur = new PanelRelleno(0, 120, false);
        Depositos.add(DepositosSur, BorderLayout.SOUTH);
        Depositos.add(Deposito, BorderLayout.CENTER);
        Centro.add(Depositos, BorderLayout.CENTER);
        Centro.add(CentroEste, BorderLayout.EAST);

////////////////////////////////////////////////////////////////////////////NORTE Panel Derecha////////////////////////////////////////////////////////////////////////////////
        PanelRelleno CentroEsteNorte = new PanelRelleno(0, 80, false);
        CentroEsteNorte.setLayout(new BorderLayout());

        PanelRelleno CentroEsteNorteNorte = new PanelRelleno(0, 8, false);
        CentroEsteNorte.add(CentroEsteNorteNorte, BorderLayout.NORTH);

        PanelRelleno CentroEsteNorteOeste = new PanelRelleno(18, 0, false);
        CentroEsteNorte.add(CentroEsteNorteOeste, BorderLayout.WEST);

        PanelRelleno CentroEsteNorteEste = new PanelRelleno(18, 0, false);
        CentroEsteNorte.add(CentroEsteNorteEste, BorderLayout.EAST);

        CentroEsteNorte.add(panelInformacion, BorderLayout.CENTER);

        CentroEste.add(CentroEsteNorte, BorderLayout.NORTH);

//////////////////////////////////////////////////////////////////SUR Panel Derecha//////////////////////////////////////////////////////////////
        PanelRelleno CentroEsteSur = new PanelRelleno(0, 88, false);
        CentroEsteSur.setLayout(new BorderLayout());

//******************************************************************ESTE SUR Panel Derecha***************************************************
        PanelRelleno CentroEsteSurEste = new PanelRelleno(132, 0, false);
        CentroEsteSurEste.setLayout(new BorderLayout());

        PanelRelleno CentroEsteSurEsteSur = new PanelRelleno(0, 24, false);
        CentroEsteSurEste.add(CentroEsteSurEsteSur, BorderLayout.SOUTH);

        PanelRelleno CentroEsteSurEsteOeste = new PanelRelleno(27, 0, false);
        CentroEsteSurEste.add(CentroEsteSurEsteOeste, BorderLayout.WEST);

        PanelRelleno CentroEsteSurEsteNorte = new PanelRelleno(0, 35, false);
        CentroEsteSurEste.add(CentroEsteSurEsteNorte, BorderLayout.NORTH);

        PanelRelleno CentroEsteSurEsteEste = new PanelRelleno(32, 0, false);
        CentroEsteSurEste.add(CentroEsteSurEsteEste, BorderLayout.EAST);

        CentroEsteSurEste.add(cuantoVuelto);

        CentroEsteSur.add(CentroEsteSurEste, BorderLayout.EAST);

//******************************************************************CENTRO SUR Panel Derecha**********************************************************

        PanelRelleno CentroEsteSurCentro = new PanelRelleno(0, 0, false);
        CentroEsteSurCentro.setLayout(new BorderLayout());

        PanelRelleno CentroEsteSurCentroOeste = new PanelRelleno(17, 0, false);
        CentroEsteSurCentro.add(CentroEsteSurCentroOeste, BorderLayout.WEST);

        CentroEsteSurCentro.add(Product, BorderLayout.CENTER);

        CentroEsteSur.add(CentroEsteSurCentro, BorderLayout.CENTER);

        CentroEste.add(CentroEsteSur, BorderLayout.SOUTH);

/////////////////////////////////////////////CENTRO Panel Derecha////////////////////////////////////////////////////////////
        PanelRelleno CentroEsteCentro = new PanelRelleno(0, 0, false);
        CentroEsteCentro.setLayout(new BorderLayout());

        PanelRelleno CentroEsteCentroOeste = new PanelRelleno(52, 0, false);
        CentroEsteCentro.add(CentroEsteCentroOeste, BorderLayout.WEST);

        PanelRelleno CentroEsteCentroNorte = new PanelRelleno(0, 27, false);
        CentroEsteCentro.add(CentroEsteCentroNorte, BorderLayout.NORTH);

        PanelRelleno CentroEsteCentroEste = new PanelRelleno(33, 0, false);
        CentroEsteCentro.add(CentroEsteCentroEste, BorderLayout.EAST);

        PanelRelleno CentroEsteCentroSur = new PanelRelleno(0, 65, false);
        CentroEsteCentro.add(CentroEsteCentroSur, BorderLayout.SOUTH);

        PanelRelleno PanelBotones = new PanelRelleno(0, 0, false);
        PanelBotones.setLayout(new GridLayout(3, 2, 16, 15));
        PanelBotones.add(CocaCola);
        PanelBotones.add(Sprite);
        PanelBotones.add(Fanta);
        PanelBotones.add(Snickers);
        PanelBotones.add(Super8);
        PanelBotones.add(cuantoGanancias);
        CentroEsteCentro.add(PanelBotones);

        CentroEste.add(CentroEsteCentro);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        this.add(Centro);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("Exp.png"))).getImage(), 0, 0, this);
    }
}
