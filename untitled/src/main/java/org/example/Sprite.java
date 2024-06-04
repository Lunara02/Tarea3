package org.example;

/**
 * Clase Sprite, representa un Producto de tipo Bebida.
 * Implementa el metodo sabor (metodo abstracto de la clase Producto) del cual se obtiene su sabor.
 * @author Braian
 */
public class Sprite extends Bebida{
    /**
     * Constructor de Sprite.
     * @param serie El numero de serie de la bebida Sprite.
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     * Metodo que otorga el sabor del producto.
     * @return El sabor de la bebida Sprite
     */
    public String sabor(){
        return "Sprite";
    }
}
