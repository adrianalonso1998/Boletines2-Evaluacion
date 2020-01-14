package clasesyobjetos;
import java.util.Scanner;
public class Persona {
	//campos
	Scanner sc = new Scanner(System.in);
	
	public String nombre;
	public String apellidos;
	public String fechaNac;
	public int estatura;

	

	public static void main(String[] args) {
		// metodos
		Scanner sc = new Scanner(System.in);
		Persona p1= new Persona();
		p1.nombre=sc.nextLine();
		p1.apellidos=sc.nextLine();
		p1.fechaNac=sc.nextLine();
		p1.estatura=sc.nextLine();
		
		
		java.util.Date fechaActual = new java.util.Date();
		System.out.println(fechaActual);
	}


//constructore
	

}
