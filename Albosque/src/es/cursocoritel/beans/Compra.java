package es.cursocoritel.beans;

import java.io.Serializable;
import java.util.Date;

public class Compra implements Serializable {
	private Producto producto;
	private Integer cantidad;
	private Date fecha;
	
	public Compra () {
		
	}
	
	

	public Compra(Producto producto, Integer cantidad, Date fecha) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}



	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
