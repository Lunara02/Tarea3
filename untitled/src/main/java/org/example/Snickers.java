package org.example;

/**
 * Clase Snickers, representa un Producto de tipo Dulces.
 * Implementa el metodo sabor (metodo abstracto de la clase Producto) del cual se obtiene su sabor.
 * @author Braian
 */
public class Snickers extends Dulces{
    /**
     * Constructor de Snickers.
     * @param serie El numero de serie del dulce Snickers.
     */
    public Snickers(int serie){
        super(serie);
    }

    /**
     * Metodo que otorga el sabor del producto.
     * @return El sabor del dulce Snickers.
     */
    public String sabor(){
        return "Snickers";
    }
}
