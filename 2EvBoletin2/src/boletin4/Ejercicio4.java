package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intruduce numero a comprobar");
		String numero = sc.nextLine();
		if(UtilTransformacionDatos.esValorNumerico(numero))
			System.out.println("Es numérico");
		else
			System.out.println("No es numérico");

		try {
			UtilTransformacionDatos.obtenerValorDouble(numero);
			System.out.println("Es double");
		} catch (NumberFormatException esc) {
			System.out.println("No es double");
		}
	}

}
