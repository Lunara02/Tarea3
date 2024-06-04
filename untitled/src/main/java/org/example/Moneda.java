package org.example;
/**
 * La clase abstracta Moneda representa un tipo genérico de moneda.
 * Implementa la interfaz Comparable para permitir la comparación entre monedas basadas en su valor.
 * @author Cristobal
 */
abstract class Moneda implements Comparable<Moneda> {
    public Moneda(){
    }
    /**
     * Devuelve la referencia a la misma moneda.
     * @return La referencia a la misma moneda.
     */
    public Moneda getSerie(){
        return this;
    }
    /**
     * Obtiene el valor de la moneda.
     * @return El valor de la moneda.
     */
    public abstract int getValor();
    /**
     * Compara la moneda actual con otra moneda en base a su valor.
     * @param other La moneda con la que se compara la moneda actual.
     * @return Un valor negativo si la moneda actual es menor que la otra, cero si son iguales y un valor positivo si la moneda actual es mayor.
     */
    @Override
    public int compareTo(Moneda other) {
        return this.getValor() - other.getValor();
    }
}
