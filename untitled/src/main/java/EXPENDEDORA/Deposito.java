package EXPENDEDORA;
import java.util.ArrayList;

/**
 * Clase para crear depositos atra vez de un depósito genérico para almacenar productos.
 * @param <T> El tipo de producto que se almacenará en el depósito.
 * @author Sebastian Ignacio Vega Varela
 * @author Braian
 */
public class Deposito<T> {
    private ArrayList<T> arr; // Lista que almacena productos en deposito
    /**
     * Constructor de la clase Deposito.
     * Inicializa la lista de productos.
     */
    public Deposito(){
        arr = new ArrayList<>();
    }
    /**
     * Añade un producto al depósito.
     * @param producto El producto a añadir.
     */
    public void addProducto(T producto){
        arr.add(producto);
    }
    /**
     * Obtiene y elimina el primer producto del depósito.
     * @return El primer producto del depósito, o null si el depósito está vacío.
     */
    public T getProducto(){
        if(arr.isEmpty()){
            return null;
        }
        else{
            return arr.removeFirst();
        }
    }
    /**
     * Obtiene el tamaño actual del depósito.
     * @return El número de productos en el depósito.
     */
    public int getSize(){
        return arr.size();
    }

    /**
     * Metodo para vaciar el deposito.
     */
    public void limpiar(){
        arr.clear();
    }

    /**
     * Metodo para obtener el producto en una posicion especifica del deposito.
     *
     * @param a Indice del producto a retirar.
     * @return El producto de la posicion especificada.
     */
    public T getIndexObject(int a){
        return arr.get(a);
    }
}
