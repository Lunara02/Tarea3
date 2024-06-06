package GUI;

import EXPENDEDORA.Expendedora;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Depositos extends JPanel {
    private Expendedora exp;
    private Image Imagen;
    private int tipo;
    private int mettipo;
    private ArrayList<PintarProducto> ProdDep;
    public Depositos(Expendedora exp, ImageIcon Imagen, int tipo, int X, int Y){
        this.setOpaque(false);
        this.exp = exp;
        this.Imagen = Imagen.getImage();
        this.tipo = tipo;
        ProdDep = new ArrayList<>();
        for(int x = 0; x < exp.getSizeProducto(tipo); x++){
            PintarProducto Pintura = new PintarProducto(Imagen, X + x*5, Y - x*4);
            ProdDep.add(Pintura);
        }
        mettipo = 1;
    }
    public Depositos(ImageIcon Imagen, int tamaño, int X, int Y, int sumx, int sumy){
        this.setOpaque(false);
        this.exp = exp;
        this.Imagen = Imagen.getImage();
        this.tipo = tamaño;
        ProdDep = new ArrayList<>();
        for(int x = 0; x < tipo; x++){
            PintarProducto Pintura = new PintarProducto(Imagen, X + x*sumx, Y - x*sumy);
            ProdDep.add(Pintura);
        }
        mettipo = 2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int Can;
        if(mettipo == 1) {
            if (exp.getSizeProducto(tipo) > 5) {
                Can = 5;
            } else {
                Can = exp.getSizeProducto(tipo);
            }
            for (int x = Can; x > 0; x--) {
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