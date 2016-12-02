import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean 

@RequestScoped 
public class UsuarioBean {
	 private String nombre;
	
	
	public String navegar() {
		String url = "bienvenida.xhtml";
		if(nombre.startsWith("admin")) {
			url ="administrador.xhtml";
		}
		return url;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
