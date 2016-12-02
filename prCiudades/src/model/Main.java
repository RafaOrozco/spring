package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("prCiudades");
		EntityManager em = factory.createEntityManager();
		Query q = em.createNamedQuery("City.findAll").setMaxResults(10);
		List<City> l = q.getResultList();
		for(City c: l)
			System.out.println(c.getName());
		
		
		Query q3 = em.createQuery("SELECT c FROM CITY C ORDER BY c.population DESC").setMaxResults(10);
		Query q4 = em.createQuery("SELECT c.name, c.country FROM CITY c ORDER BY ASC").setFirstResult(1);
		Query q5 = em.createQuery("SELECT c.name, c.continet, AVG(c.population) FROM COUNTRY c GROUP BY c.continet HAVING c.continent = 'Europe'");
	}
}