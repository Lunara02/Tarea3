package org.example;

/**
 * Clase Super8, representa un Producto de tipo Dulces.
 * Implementa el metodo sabor (metodo abstracto de la clase Producto) del cual se obtiene su sabor.
 * @author Braian
 */
public class Super8 extends Dulces{
    /**
     * Constructor de Super8.
     * @param serie El numero de serie del dulce Super8.
     */
    public Super8(int serie){
        super(serie);
    }

    /**
     * Metodo que otorga el sabor del producto.
     * @return El sabor del dulce Super8.
     */
    public String sabor(){
        return "Super8";
    }
}
