package clasesyobjetos;
import java.util.Scanner;
public class Persona {
	Scanner sc = new Scanner(System.in);
	
	public String nombre;
	public String apellidos;
	public String fechaNac;
	public String estatura;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Persona p1= new Persona();
		p1.nombre=sc.nextLine();
		p1.apellidos=sc.nextLine();
		p1.fechaNac=sc.nextLine();
		p1.estatura=sc.nextLine();
		
		int a=0;//hola ukui
		java.util.Date fechaActual = new java.util.Date();
		System.out.println(fechaActual);
	}



	

}
