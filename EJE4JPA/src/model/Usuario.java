package model;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	   
	@Id
	private String dni;
	@Column(length = 100)
	private String nombre;
	private String apellidos;
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;
	private Double altura;
	@Transient
	private Integer edad;
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@JoinColumn(name="producto_mas_caro")
	private Producto producto;

	public Usuario() {
		super();
	}   
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}   
	public Date getFecha_nacimiento() {
		return this.fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}   
	public Double getAltura() {
		return this.altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
   
	
}
