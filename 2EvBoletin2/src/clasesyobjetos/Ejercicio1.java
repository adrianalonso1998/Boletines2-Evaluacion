package clasesyobjetos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// constructores

		Persona p1 = new Persona();
		p1.nombre = "Jose";
		p1.apellidos = "Rodriguez Mata";
		//p1.fechaNac = LocalDate.of(1965, 1, 15);// new LocalDate(0, 0, 0); // 15/01/1965;
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		p1.fechaNac = LocalDate.parse("15/01/1965",dtf);
		p1.estatura = 165;
		p1.mostrarDatos();
		p1.obtenerEdad();
		
		Persona p2 = new Persona();
		p2.nombre = "Mar�a";
		p2.apellidos = "S�nchez G�mez";
		//p2.fechaNac = LocalDate.of(1980, 12, 26);// new LocalDate(0, 0, 0); // 15/01/1965;
		p2.fechaNac = LocalDate.parse("26/12/1980",dtf);
		p2.estatura = 170;
		p2.mostrarDatos();
		p2.obtenerEdad();
		
		Persona p3 = new Persona();
		p3.nombre = "Alejardro";
		p3.apellidos = "G�mez G�mez";
		//p3.fechaNac = LocalDate.of(2001, 11, 1);// new LocalDate(0, 0, 0); // 15/01/1965;
		p3.fechaNac = LocalDate.parse("01/11/2001",dtf);
		p3.estatura = 190;
		p3.mostrarDatos();
		p3.obtenerEdad();

		Persona p4 = new Persona();
		p4.nombre = "Jose Manuel";
		p4.apellidos = "P�rez Pons";
		//p4.fechaNac = LocalDate.of(2010, 5, 1);// new LocalDate(0, 0, 0); // 15/01/1965;
		p4.fechaNac = LocalDate.parse("01/05/2010",dtf);
		p4.estatura = 127;
		p4.mostrarDatos();
		p4.obtenerEdad();
		
		//nuevo constructor
		Persona p5 = new Persona("Luis", "Rodriguez", LocalDate.of(1998, 04, 15));
		
		
		
		//for each guarda los tipo persona en un array y los recorre para visualizar
		Persona[]arrayP= {p1,p2,p3,p4,p5};	
		for(Persona p: arrayP)
		{
			p.obtenerEdad();
			p.mostrarDatos();
		}
		//recorrer otra forma array
		System.out.println("siguiente forma\n\n\n\n");
		Persona[] array=new Persona[5];
		array[0]=p1;
		array[1]=p2;
		array[2]=p3;
		array[3]=p4;
		array[4]=p5;
		Persona personaedadMax();
		for(int i=0;i<array.length;i++)
		{
			Persona p=array[i];	
			p.obtenerEdad();
			p.mostrarDatos();
			if(p.obtenerEdad()>personaEdadMax)
			{
			personaEdadMax=p.obtenerEdad();
			}
			System.out.println(personaEdadMax);
		}
		
		
		
		
		//fecha actual
		java.util.Date fechaActual = new java.util.Date();
		System.out.println(fechaActual);
	}

}
