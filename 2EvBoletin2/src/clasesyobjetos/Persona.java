package clasesyobjetos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Persona {
	// campos
	public String nombre;
	public String apellidos;
	public LocalDate fechaNac;
	public int estatura;

	// metodos

	public void mostrarDatos() {

		System.out.println(nombre);
		System.out.println(apellidos);
		System.out.println(estatura);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println(dtf.format(fechaNac));
	}

	public void obtenerEdad() {

		long edad = ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
		System.out.println(edad + "\n");
	}
	
//	public Persona
	
	
}
