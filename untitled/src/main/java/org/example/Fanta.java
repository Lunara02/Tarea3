package org.example;

/**
 * Clase Fanta, representa un Producto de tipo Bebida.
 * Implementa el metodo sabor (metodo abstracto de la clase Producto) del cual se obtiene su sabor.
 * @author Braian
 */
public class Fanta extends Bebida{
    /**
     * Constructor de Fanta.
     * @param serie El numero de serie de la bebida Fanta.
     */
    public Fanta(int serie){
        super(serie);
    }

    /**
     * Metodo que otorga el sabor del producto.
     * @return El sabor de la bebida Fanta.
     */
    public String sabor(){
        return "Fanta";
    }
}
