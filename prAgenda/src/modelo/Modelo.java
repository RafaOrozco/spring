/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Modelo {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public Modelo()
    {
        emf = Persistence.createEntityManagerFactory("prAgenda");
        em=emf.createEntityManager();
    }
    
    public boolean aniadirContacto (Contacto c)
    {
    	em.getTransaction().begin();
    	em.persist(c);
    	em.getTransaction().commit();
        return true;
    }
    
    public void modificarContacto (Contacto c)
    {
    	em.getTransaction().begin();
    	em.merge(c);
    	em.getTransaction().commit();
    	
    }
    
    public void eliminarContacto (Contacto c)
    {
    	em.getTransaction().begin();
    	em.remove(c);
    	em.getTransaction().commit();
    }
    
    public List<Contacto> getContactos()
    {
        // TODO: Insertar código para devolver todos los contactos de la BBDD (se puede hacer en 3 líneas contando las que ya hay)
        List<Contacto> res = null;
       res = em.createNamedQuery("todosContactos").getResultList();
        return res;
    }
    
    public void cerrar()
    {
        em.close();
        emf.close();
    }
    
    
}
