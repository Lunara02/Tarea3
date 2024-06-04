package org.example;
/**
 * La clase Moneda500 representa una moneda de valor 500.
 * Extiende la clase abstracta Moneda y proporciona la implementación del método getValor().
 * @author Cristobal
 */
public class Moneda500 extends Moneda{
    /**
    * Constructor de la clase Moneda500.
    */
    public Moneda500(){
        super();
    }
    /**
    * Obtiene el valor de la moneda.
    * @return valor de la moneda, que es 500.
    */
    public int getValor(){
        return 500;
    }
}
