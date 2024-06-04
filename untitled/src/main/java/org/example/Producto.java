package org.example;
/**
 * Clase Producto que se usara polimorficamente para Dulces y Bebidas.
 * Define la propiedad serie, unica de cada instancia y el metodo sabor que debe ser implementado por las clases herederas.
 * @author Braian
 */
abstract public class Producto {
    /** Int para almacenar el numero de serie del producto */
    private int serie;

    /**
     *  Constructor de la clase Producto.
     * @param serie El numero de serie del producto.
     */
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     * Metodo que otorga el valor de serie del producto.
     * @return El numero de serie del producto.
     */
    public int getSerie(){
        return serie;
    }

    /**
     * Metodo abstracto que las clases herederas deben implementar para asi obtener el sabor de cada Producto.
     * @return un String con el sabor del Producto.
     */
    public abstract String sabor();
}
