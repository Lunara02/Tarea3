package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * La clase PanelInformacion muestra informacion relevante al usuario acerca del dinero que ha ingresado, el producto seleccionado,
 * y le informa de los errores que ha experimentado la expendedora al intentar realizar su compra.
 * Utiliza tres instancias de la clase Registrador para mostrar esta información.
 * @author Braian Urra
 */
public class PanelInformacion extends JPanel {
    private Registrador Credito = new Registrador("Credito: 0");
    private Registrador IngreseProducto = new Registrador("Seleccione producto: ");
    private Registrador Error = new Registrador("");

    /**
     * Constructor del panel PanelInformacion
     * Define el tipo de layout del panel y añade las etiquetas de informacion.
     */
    public PanelInformacion(){
        setLayout(new GridLayout(3,1));
        add(Credito);
        add(IngreseProducto);
        add(Error);
    }

    /**
     * Método que actualiza la etiqueta de credito de la expendedora.
     *
     * @param x Valor del credito actual de la expendedora
     */
    public void new_credito(int x){
        Credito.setText("Credito: " +x);
    }

    /**
     * Método que actualiza la etiqueta del producto seleccionado.
     *
     * @param producto Nombre del producto seleccionado
     */
    public void new_producto(String producto){
        IngreseProducto.setText("Seleccione producto: "+ producto);
    }

    /**
     * Método que actualiza el mensaje de error que presento la expendedora.
     *
     * @param a Es el mensaje del error a mostrar
     */
    public void LanzarError(String a){
        Error.setText(a);
    }
}
