package EXPENDEDORA;

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
    private Deposito<Moneda> monVu = new Deposito<>(), monCompra = new Deposito<>(); //Deposito de Monedas
    private Producto productoComprado = null;
    private int vuelto = 0;
    private int numProductos = 0;
    private Moneda monedaIgresada = null;
    private int Ganancias = 0;
    /**
     * Constructor de la clase Expendedora.
     * Rellena magicamente los depositos con el producto correspondiente
     * @param numProductos El número de productos que se agregarán a la expendedora.
     */
    public Expendedora(int numProductos) {
        this.numProductos = numProductos;
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
     * @param cual El tipo de producto que se desea comprar.
     * @return El producto comprado.
     * @throws PagoIncorrectoException Si la moneda es nula.
     * @throws PagoInsuficienteException Si el valor de la moneda no es suficiente para comprar el producto.
     * @throws NoHayProductoException Si no hay existencias del producto seleccionado.
     */
    public void ComprarProducto(Productos cual) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        if (monedaIgresada != null) {
            if (Ganancias >= cual.RetValor()) { //Caso PagoInsuficiente
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
                if (seleccion.getSize() != 0) {
                    for (int i = 0; i < (Ganancias - cual.RetValor()) / 100; i++) {
                        monVu.addProducto(new Moneda100());
                    }
                    Ganancias -= cual.RetValor();
                    productoComprado = seleccion.getProducto();
                } else {
                    throw new NoHayProductoException();
                }
            } else {
                throw new PagoInsuficienteException();
            }
        } else {
            throw new PagoIncorrectoException();
        }
    }
    /**
     * Método para obtener el vuelto acumulado en la máquina expendedora.
     * @return La moneda que representa el vuelto.
     */
    public Producto getProducto() {
        if (productoComprado != null) {
            return productoComprado;
        }
        return null;
    }

    public void eliminarProducto() {
        productoComprado = null;
    }

    public void EliminarMonedaIngresada() {
        monedaIgresada = null;
    }
    public int getVuelto() {
        if (monVu.getSize() != 0) {
            while (monVu.getSize() != 0) {
                System.out.println(monVu.getSize());
                Moneda m = monVu.getProducto();
                vuelto += m.getValor();
                System.out.println(m.getValor());
            }
        } else {
            vuelto = Ganancias;
            Ganancias = 0;
        }
        int a = vuelto;
        vuelto = 0;
        return a;
    }

    public void setMonedaIngresada(Moneda a) {
        monedaIgresada = a;
        monCompra.addProducto(monedaIgresada);
        Ganancias += a.getValor();
        System.out.println(Ganancias);
    }

    public int getDineroIngresado() {
        return Ganancias;
    }

    public int getSizeProducto() {
        if (productoComprado != null) {
            if (productoComprado.sabor().equals("CocaCola")) {
                return coca.getSize();
            }
            if (productoComprado.sabor().equals("Sprite")) {
                return sprite.getSize();
            }
            if (productoComprado.sabor().equals("Fanta")) {
                return fanta.getSize();
            }
            if (productoComprado.sabor().equals("Snickers")) {
                return snicker.getSize();
            }
            if (productoComprado.sabor().equals("Super8")) {
                return super8.getSize();
            }
        }
        return -1;
    }

    public int getSizeProducto(int d) {
        switch (d) {
            case 1:
                return coca.getSize();
            case 2:
                return sprite.getSize();
            case 3:
                return fanta.getSize();
            case 4:
                return snicker.getSize();
            case 5:
                return super8.getSize();
        }
        return 0;
    }

    public void llenarExpendedora(){
        coca.limpiar();
        sprite.limpiar();
        fanta.limpiar();
        snicker.limpiar();
        super8.limpiar();
        for (int i = 0; i < numProductos; i++) {  //Rellena magicamente los depositos
            coca.addProducto(new CocaCola(i + 100));
            sprite.addProducto(new Sprite(i + 200));
            fanta.addProducto(new Fanta(i + 300));
            snicker.addProducto(new Snickers(i + 400));
            super8.addProducto(new Super8(i + 500));
        }
    }

    public Deposito<Moneda> getmonCompra(){
        return monCompra;
    }
}