package es.cursocoritel.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrito implements Serializable {
	private List<Compra> compras;
	
	public Carrito() {
		compras = new ArrayList<>();
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	
	public void addCompra(Producto p, Integer c) {
		compras.add(new Compra(p,c,new Date()));
	}
	
	
}
