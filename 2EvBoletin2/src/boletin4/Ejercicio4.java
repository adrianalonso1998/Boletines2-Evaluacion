package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intruduce numero a comprobar2");
		String numero = sc.nextLine();
		if(UtilTransformacionDatos.esValorNumerico(numero))
			System.out.println("Es numérico");
		else
			System.out.println("No es numérico");
		boolean valorCorrecto=false;
		
		 
		
		
		while(valorCorrecto==false) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Intruduce numero a comprobar");
			String numero1 = sc1.nextLine();
		try {
			UtilObtencionDatos.obtenerValorDouble(numero1);
			System.out.println("Es double");
			valorCorrecto=true;
		} catch (ValorNumericoNegativoException esc) {
			System.out.println("No es double");
			System.out.println(esc.getMessage());
			valorCorrecto=false;
		}
		catch (NumberFormatException asd) {
			System.out.println("No es valor numerico");
			System.out.println(asd.getMessage());
			valorCorrecto=false;
		}
		}
	
		System.out.println("introduce el nombre de usuario");
		String usuario=sc.nextLine();
		System.out.println("introduce la contraseña");
		String contraseña=sc.nextLine();
		try {
		UtilLogeo.realizarLogin(usuario,contraseña);
		System.out.println("Accediendo al sistema");
		}
		catch(LoginUsuarioNoExistente e) {
		System.out.println(e.getMessage());
		}
		catch(LoginUsuarioPassErroneo a){
		System.out.println(a.getMessage());
		}
	}

}
