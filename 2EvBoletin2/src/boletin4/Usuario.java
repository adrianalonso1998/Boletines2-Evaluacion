package boletin4;

public class Usuario {
	private String nombreUsuario;
	private String contraseña;
	
	public Usuario(String usuario, String pass) {
		nombreUsuario=usuario;
		contraseña=pass;
	}

	public   String getNombreUsuario() {
		return this.nombreUsuario;
	}
	public String getContraseña() {
		return this.contraseña;
	}
}
