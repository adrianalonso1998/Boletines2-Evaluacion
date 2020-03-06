package boletin4;
import java.io.IOException;
	public class LoginUsuarioNoExistente extends IOException{
		public LoginUsuarioNoExistente(String mensaje) {
			super(mensaje);
		}
	}

