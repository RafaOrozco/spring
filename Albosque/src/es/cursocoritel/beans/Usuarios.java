package es.cursocoritel.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;

	public Usuarios() {
		usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Pepe", "L", "1", "1"));
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario(Usuario usuario) {
		Usuario usuarioEnc = null;
		for (Usuario u : usuarios) {
			if (u.getDNI().equals(usuario.getDNI()) && u.getClave().equals(usuario.getClave())) {
				usuarioEnc = u;
			}
		}
		return usuarioEnc;
	}
}
