package Boletin3;

import java.time.format.DateTimeFormatter;

public class Vehiculo {

	protected String matricula;
	protected String tipo;
	protected int vMaxima;
	protected Conductor conductor;

	public void setMatricula (String matricula) {
		this.matricula=matricula;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setTipo (String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	public void setVMaxima (int vMaxima) {
		this.vMaxima=vMaxima;
	}
	public int getVMaxima() {
		return this.vMaxima;
	}
	
	public void setConductor (Conductor Conductor) {
		this.conductor=Conductor;
	}
	public Conductor getConductor() {
		return this.conductor;
	}
	public void mostrarDatos() {

		System.out.println("Matricula " + matricula);
		System.out.println("tipo " + tipo);
		System.out.println("Conductor " + conductor);
		System.out.println("vMaxima " + vMaxima+"\n");
	}

	public Vehiculo() {
		
	}
	
	public Vehiculo(String matricula, String tipo, int vMaxima, Conductor conductor) {
		this.matricula=matricula;	
		this.tipo=tipo;
		this.vMaxima=vMaxima;
		this.conductor=conductor;
		}
	public Vehiculo(String matricula, String tipo, int vMaxima) {
		this.matricula=matricula;	
		this.tipo=tipo;
		this.vMaxima=vMaxima;
	}
	
}
