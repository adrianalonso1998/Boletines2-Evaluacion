package boletin4;

public class Usuario {
	private String nombreUsuario;
	private String contrase�a;
	
	public Usuario(String usuario, String pass) {
		nombreUsuario=usuario;
		contrase�a=pass;
	}

	public   String getNombreUsuario() {
		return this.nombreUsuario;
	}
	public String getContrase�a() {
		return this.contrase�a;
	}
}
