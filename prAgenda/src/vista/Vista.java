/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import modelo.Contacto;
import java.util.List;

public interface Vista {
    void addContacto(Contacto c);
    Contacto getSelected();
    void setContactos(List<Contacto> contactos);
    void setContolador(Controlador ctrl);
}
