package org.example;
/**
 * Esta clase representa una excepción que se lanza cuando no hay productos disponibles.
 * Extiende la clase abstracta Exception y proporciona una implementación personalizada del constructor.
 * @author Cristobal
 */
public class NoHayProductoException extends Exception{
    /**
     * Constructor que crea una instancia de NoHayProductoException.
     * Utiliza el constructor de la superclase Exception para enviar el mensaje.
     */
    public NoHayProductoException(){
        super("[NO HAY PRODUCTOS]");
    }
}
