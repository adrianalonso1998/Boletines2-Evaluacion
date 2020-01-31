package Boletin3;

public class Conductor {

	public String dni;
	public String nombre;
	
	public Conductor(String dni, String nombre) {
	this.dni=dni;	
	this.nombre=nombre;
	}
	@Override
	public String toString()
	{
		return String.format("DNI %s + Nombre %s ", dni, nombre);
	}
}
