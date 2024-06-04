package org.example;
/**
 * Esta clase representa una excepción que se lanza cuando el pago en incorrecto.
 * Extiende la clase abstracta Exception y proporciona una implementación personalizada del constructor.
 * @author Cristobal
 */
public class PagoIncorrectoException extends Exception{
    /**
     * Constructor que crea una instancia de PagoIncorrectoException.
     * Utiliza el constructor de la superclase Exception para enviar el mensaje.
     */
    public PagoIncorrectoException(){
        super("[NO SE A INSERTADO MONEDA]");
    }
}
