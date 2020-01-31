package Boletin3;

import java.time.format.DateTimeFormatter;

public class Coche extends Vehiculo{

	private int numeroPlazas;
	
	public Coche (String matricula, String tipo, int vMaxima, int numeroPlazas)
	{
		this.matricula=matricula;
		this.tipo=tipo;
		this.vMaxima=vMaxima;
		this.numeroPlazas=numeroPlazas;
	}

	public void setNumeroPlazas (int numeroPlazas) {
		this.numeroPlazas=numeroPlazas;
	}
	public int getNuemeroPlazas() {
		return this.numeroPlazas;
	}
	@Override 
	public void mostrarDatos() {

		System.out.println("numeroPlazas " + numeroPlazas);
		super.mostrarDatos();
		
	}
	
	@Override
	public String toString() {
		return String.format("matricula %s", matricula);
	}

}
