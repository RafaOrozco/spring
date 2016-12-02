/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Contacto;
import java.awt.event.ActionListener;

public interface Controlador extends ActionListener {
    
    public void modificaContacto(Contacto c);
    
}
