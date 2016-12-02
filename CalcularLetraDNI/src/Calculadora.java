import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Calculadora {
	private String numero;
	private char letra;
	
	public Calculadora() {
		
	}
 	

	public String calcular() {
		String numero= this.numero;
		if (numero.startsWith("X")) {
			numero ="0"+numero.substring(1, numero.length()-1);
		} else {
			if (numero.startsWith("Y")) {
				numero ="1"+numero.substring(1, numero.length()-1);

			} else {
				if (numero.startsWith("Z")) {
					numero ="2"+numero.substring(1, numero.length()-1);
				} 
			}
		}

		char letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(Integer.parseInt(numero) % 23);
		this.letra=letra;
		return null;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	
	

}
