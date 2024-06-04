package org.example;

/**
 * La clase Expendedora representa una máquina expendedora que vende productos como bebidas o dulces.
 * Esta vende los productos al comprador dependiendo de los parametros otorgados.
 * Crea magicamente Productos que seran puestos en los depositos correspondientes.
 * Finalmente retorna el vuelto y el producto seleccionado.
 * @author Sebastian Vega Ignacio Varela
 */
public class Expendedora {
    private Deposito<Bebida> coca = new Deposito<>(), sprite = new Deposito<>(), fanta = new Deposito<>(); //Deposito de Bebidas
    private Deposito<Dulces> snicker = new Deposito<>(), super8 = new Deposito<>(); //Deposito de Dulces
    private Deposito<Moneda> monVu = new Deposito<>(); //Deposito de Monedas
    /**
     * Constructor de la clase Expendedora.
     * Rellena magicamente los depositos con el producto correspondiente
     * @param numProductos El número de productos que se agregarán a la expendedora.
     */
    public Expendedora(int numProductos) {
        for (int i = 0; i < numProductos; i++) {  //Rellena magicamente los depositos
            coca.addProducto(new CocaCola(i + 100));
            sprite.addProducto(new Sprite(i + 200));
            fanta.addProducto(new Fanta(i + 300));
            snicker.addProducto(new Snickers(i + 400));
            super8.addProducto(new Super8(i + 500));
        }
    }
    /**
     * Método para comprar un producto de la expendedora.
     * @param m La moneda utilizada para la compra.
     * @param cual El tipo de producto que se desea comprar.
     * @return El producto comprado.
     * @throws PagoIncorrectoException Si la moneda es nula.
     * @throws PagoInsuficienteException Si el valor de la moneda no es suficiente para comprar el producto.
     * @throws NoHayProductoException Si no hay existencias del producto seleccionado.
     */
    public Producto ComprarProducto(Moneda m, Productos cual)throws Exception{
        if(m != null){ //Caso PagoIncorrecto
            if (m.getValor() >= cual.RetValor()) { //Caso PagoInsuficiente
                Deposito<? extends Producto> seleccion = null; //Selector de deposito para referenciar
                switch (cual) {
                    case COCACOLA:
                        seleccion = coca;
                        break;
                    case SPRITE:
                        seleccion = sprite;
                        break;
                    case FANTA:
                        seleccion = fanta;
                        break;
                    case SNICKERS:
                        seleccion = snicker;
                        break;
                    case SUPER8:
                        seleccion = super8;
                        break;
                }
                if (seleccion.getSize() != 0) { //Caso NoHayProductos
                    for (int i = 0; i < (m.getValor() - cual.RetValor()) / 100; i++) {
                        monVu.addProducto(new Moneda100());
                    }
                    return seleccion.getProducto();
                }
                monVu.addProducto(m);
                throw new NoHayProductoException();
            }
            monVu.addProducto(m);
            throw new PagoInsuficienteException();
        }
        throw new PagoIncorrectoException();
    }
    /**
     * Método para obtener el vuelto acumulado en la máquina expendedora.
     * @return La moneda que representa el vuelto.
     */
    public Moneda getVuelto(){
        return monVu.getProducto();
    }
    /**
     * Método para obtener el tamaño del depósito de monedas en la expendedora.
     * @return El tamaño del depósito de monedas.
     */
    public int getmonVuSize(){
        return monVu.getSize();
    }
}