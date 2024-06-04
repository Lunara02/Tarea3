package org.example;

/**
 * Enumeración que representa diferentes productos y sus precios.
 * Se asignan los precios que se van a utilizar (se puede cambiar).
 * @author Sebastian Ignacio Vega Varela
 */
public enum Productos {
    /**
     * Representa el producto CocaCola con un precio de 900.
     */
    COCACOLA(900),
    /**
     * Representa el producto Sprite con un precio de 800.
     */
    SPRITE(800),
    /**
     * Representa el producto Fanta con un precio de 600.
     */
    FANTA(600),
    /**
     * Representa el producto Snickers con un precio de 1000.
     */
    SNICKERS(1000),
    /**
     * Representa el producto Super8 con un precio de 300.
     */
    SUPER8(300);
    /**
     * Precio de cada producto.
     */
    private int precio;
    /**
     * Constructor privado de enum Productos.
     * @param precio El precio del producto.
     */
    private Productos(int precio) {
        this.precio = precio;
    }
    /**
     * Método getter para retornar el precio del producto.
     * @return El precio del producto.
     */
    public int RetValor() {
        return precio;
    }
}
