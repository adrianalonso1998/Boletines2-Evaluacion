package boletin4;

import java.util.Timer;

public class UtilTransformacionDatos {

	

	public static boolean esValorNumerico(String numero) {

		try {
			double d = Double.valueOf(numero);
			return true;
		} catch (NumberFormatException e) {
			// e.printStackTrace(); // para imprimir igualmente el mensaje de error, pero
			// sin petar
			return false;
		}

	}

}
