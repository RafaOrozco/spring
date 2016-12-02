/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Contacto;
import modelo.Modelo;
import vista.Vista;
import java.awt.event.ActionEvent;


public class CtrlContactos implements Controlador {

    private Modelo modelo;
    private Vista vista;
    
    public CtrlContactos(Modelo m, Vista v)
    {
        vista = v;
        modelo = m;
        
        vista.setContolador(this);
        vista.setContactos(modelo.getContactos());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Anadir":
                aniadirContacto();
                break;
            case "Eliminar":
                eliminarContacto();
                break;
        }
    }

    private void aniadirContacto() {
        Contacto c = new Contacto();
        modelo.aniadirContacto(c);
        vista.addContacto(c);
    }

    private void eliminarContacto() {
        Contacto c = vista.getSelected();
        if (c != null)
        {
            modelo.eliminarContacto(c);
            vista.setContactos(modelo.getContactos());
        }
    }

    @Override
    public void modificaContacto(Contacto c) {
        modelo.modificarContacto(c);
    }
}
