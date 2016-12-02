package es.cursocoritel.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalogo implements Serializable {
	private List<Producto> productos;

	public Catalogo() {
		productos = new ArrayList<Producto>();
		productos.add(new Producto("Pan", "El más tierno", 0.60, 100));
		productos.add(new Producto("Tomate", "cheddar", 1.20, 300));
		productos.add(new Producto("Tablet 50 pulgadas", "Tablet de samsung", 300.0, 10));
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto getProducto(String producto) {
		Producto productoEnc = null;
		for (Producto p : productos) {
			if (p.getNombre().equals(producto)) {
				productoEnc = p;
			}
		}
		return productoEnc;
	}
	
	public void comprar(String producto, int cantidad) {
		
		Producto p = getProducto(producto);
		p.setStock(p.getStock()-cantidad);
	}

}
