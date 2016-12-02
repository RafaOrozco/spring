package es.cursocoritel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Serializable {
	private List<Opinion> opiniones;
	
	public Libro() {
		opiniones = new ArrayList<Opinion>();
	}
	
	public void anadirOpinion(Opinion opinion) {
		opiniones.add(opinion);
	}

	public List<Opinion> getOpiniones() {
		return opiniones;
	}

	public void setOpiniones(List<Opinion> opiniones) {
		this.opiniones = opiniones;
	}
	
	
}
