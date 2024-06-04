package org.example;

/**
 * Clase abstracta Bebida que representa un tipo de producto, hereda la propiedad serie.
 * Se usara para diferenciar los productos de tipo Bebida de los productos de tipo Dulces.
 * @author Braian
 */
abstract public class Bebida extends Producto{
    /**
     * Constructor de la clase Bebida.
     * @param serie El numero de serie de la bebida.
     */
    public Bebida(int serie){
        super(serie);
    }

}
