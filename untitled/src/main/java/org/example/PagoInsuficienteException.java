package org.example;
/**
 * Esta clase representa una excepción que se lanza cuando el pago es insuficiente.
 * Extiende la clase abstracta Exception y proporciona una implementación personalizada del constructor.
 * @author Cristobal
 */
public class PagoInsuficienteException extends Exception{
    /**
     * Constructor que crea una instancia de PagoInsuficienteException.
     * Utiliza el constructor de la superclase Exception para enviar el mensaje.
     */
    public PagoInsuficienteException(){
        super("[MONEDA INSUFICIENTE PARA REALIZAR PAGO]");
    }
}
