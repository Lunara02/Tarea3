package org.example;
/**
 * La clase Moneda1000 representa una moneda de valor 1000.
 * Extiende la clase abstracta Moneda y proporciona la implementación del método getValor().
 * @author Cristobal
 */
public class Moneda1000 extends Moneda{
    /**
     * Constructor de la clase Moneda1000.
     */
    public Moneda1000(){
        super();
    }
    /**
     * Obtiene el valor de la moneda.
     * @return valor de la moneda, que es 1000.
     */
    public int getValor(){
        return 1000;
    }
}
