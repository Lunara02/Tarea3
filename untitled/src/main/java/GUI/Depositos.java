package GUI;

import EXPENDEDORA.Expendedora;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * La clase Depositos extiende JPanel y representa un conjunto de productos en una máquina expendedora.
 * Esta clase tiene dos constructores que permiten inicializar los depósitos de diferentes maneras,
 * dependiendo de lo que se requiera.
 * @author Sebastian Ignacio Vega Varela
 */
public class Depositos extends JPanel {
    private Expendedora exp;
    private Image Imagen;
    private int tipo;
    private int mettipo;
    private ArrayList<PintarProducto> ProdDep;

    /**
     * Constructor para crear un Depositos con una referencia a una Expendedora,
     * una imagen, un tipo de producto, y posiciones iniciales.
     * @param exp La referencia a la Expendedora principal.
     * @param Imagen El icono de la imagen del producto.
     * @param tipo El tipo de producto.
     * @param X La posición inicial X.
     * @param Y La posición inicial Y.
     */
    public Depositos(Expendedora exp, ImageIcon Imagen, int tipo, int X, int Y) {
        this.setOpaque(false);
        this.exp = exp;
        this.Imagen = Imagen.getImage();
        this.tipo = tipo;
        ProdDep = new ArrayList<>();
        for(int x = 0; x < exp.getSizeProducto(tipo); x++) {
            PintarProducto Pintura = new PintarProducto(Imagen, X + x*5, Y - x*4);
            ProdDep.add(Pintura);
        }
        mettipo = 1;
    }

    /**
     * Constructor para crear un Depositos con una imagen, tamaño del depósito,
     * posiciones iniciales y valores para colocar imagenes desfazada como se requiera.
     * @param Imagen El icono de la imagen del producto.
     * @param tamaño El tamaño del depósito (número de productos).
     * @param X La posición inicial X.
     * @param Y La posición inicial Y.
     * @param sumx El incremento de la posición X para cada producto.
     * @param sumy El decremento de la posición Y para cada producto.
     */
    public Depositos(ImageIcon Imagen, int tamaño, int X, int Y, int sumx, int sumy) {
        this.setOpaque(false);
        this.Imagen = Imagen.getImage();
        this.tipo = tamaño;
        ProdDep = new ArrayList<>();
        for(int x = 0; x < tipo; x++){
            PintarProducto Pintura = new PintarProducto(Imagen, X + x*sumx, Y - x*sumy);
            ProdDep.add(Pintura);
        }
        mettipo = 2;
    }

    /**
     * Pinta los productos en el depósito.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int Can;
        if(mettipo == 1){
            if (exp.getSizeProducto(tipo) > 5) {
                Can = 5;
            } else {
                Can = exp.getSizeProducto(tipo);
            }
            for(int x = Can; x > 0; x--){
                ProdDep.get(x - 1).paintComponent(g);
            }
        }
        if(mettipo == 2){
            Can = tipo;
            for(int x = Can; x > 0; x--){
                ProdDep.get(x - 1).paintComponent(g);
            }
        }
    }
}