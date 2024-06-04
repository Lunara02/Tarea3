package org.example;

/**
 * Clase CocaCola, representa un Producto de tipo Bebida.
 * Implementa el metodo sabor (metodo abstracto de la clase Producto) del cual se obtiene su sabor.
 * @author Braian
 */
public class CocaCola extends Bebida{
    /**
     * Constructor de CocaCola.
     * @param serie El numero de serie de la bebida CocaCola.
     */
    public CocaCola(int serie){
        super(serie);
    }

    /**
     * Metodo que otorga el sabor del producto.
     * @return El sabor de la bebida CocaCola.
     */
    public String sabor(){
        return "CocaCola";
    }
}