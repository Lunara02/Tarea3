package org.example;
/**
 * La clase Moneda100 representa una moneda de valor 100.
 * Extiende la clase abstracta Moneda y proporciona la implementación del método getValor().
 * @author Cristobal
 */
public class Moneda100 extends Moneda{
    /**
    * Constructor de la clase Moneda100.
    */
    public Moneda100(){
        super();
    }
    /**
    * Obtiene el valor de la moneda.
    * @return valor de la moneda, que es 100.
    */
    public int getValor(){
        return 100;
    }
}
