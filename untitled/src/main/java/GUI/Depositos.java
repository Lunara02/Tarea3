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
    
}