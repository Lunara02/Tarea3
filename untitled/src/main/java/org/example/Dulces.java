package org.example;
/**
 * Clase abstracta Dulces que representa un tipo de producto, hereda la propiedad serie.
 * Se usara para diferenciar los productos de tipo Dulces de los productos de tipo Bebida.
 * @author Braian
 */
abstract public class Dulces extends Producto{
    /**
     * Constructor de la clase Dulces.
     * @param serie El numero de serie del dulce.
     */
    public Dulces(int serie){
        super(serie);
    }
}
