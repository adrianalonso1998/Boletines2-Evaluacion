package Boletin3;

public class Remolque {

	public String matricula;
	public int longitud;

	@Override
	public String toString()
	{
		return String.format("matricula %s + longitud %s ", matricula,longitud);
	}
}
