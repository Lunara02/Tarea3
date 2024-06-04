package org.example;
/**
 * La clase Comprador representa a un cliente que realiza una compra en la expendedora.
 * Registra el sonido del producto adquirido y el vuelto obtenido después de la compra.
 * Esta clase se utiliza para gestionar las interacciones de un comprador con una expendedora automática.
 * El vuelto se calcula sumando el valor de todas las monedas devueltas por la expendedora.
 * @author Cristobal
 */
public class Comprador {
    private String sonido=null;
    private int vuelto = 0;
    /**
     * Constructor de la clase Comprador.
     * Realiza una compra en la expendedora automática y registra el sonido del producto adquirido
     * y el vuelto obtenido.
     * @param m La moneda utilizada para la compra.
     * @param cualpro El producto que se desea comprar.
     * @param exp La expendedora automática en la que se realiza la compra.
     * @throws Exception Si ocurre un error durante la compra.
     */
    public Comprador(Moneda m, Productos cualpro, Expendedora exp) throws Exception{
        Producto aux = exp.ComprarProducto(m, cualpro);
        if (aux != null) {
            sonido = aux.sabor();
        }
        int canVuelt = exp.getmonVuSize();
        for(int x = 0; x < canVuelt; x++){
            vuelto += (exp.getVuelto()).getValor();
        }
    }
    /**
     * Devuelve el monto total del vuelto obtenido.
     * @return El monto total del vuelto.
     */
    public int cuantoVuelto(){
        return vuelto;
    }
    /**
     * Devuelve el sonido del producto adquirido.
     * @return El sonido del producto adquirido.
     */
    public String queProducto(){
        return sonido;
    }
}