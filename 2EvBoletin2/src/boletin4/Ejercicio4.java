package boletin4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intruduce numero a comprobar");
		String numero = sc.nextLine(); 
		UtilTransformacionDatos.esValorNumerico(numero);

	}

}
