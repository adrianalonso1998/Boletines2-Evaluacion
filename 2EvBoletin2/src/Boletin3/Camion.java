package Boletin3;

public class Camion extends Vehiculo {

	private int altura;
	private Remolque remolque;
	
	public Camion (String matricula, String tipo,int vMaxima, Remolque remolque) {
		this.matricula=matricula;
		this.tipo=tipo;
		this.vMaxima=vMaxima;
		this.remolque=remolque;
	}
	
	public void setAltura (int altura) {
		this.altura=altura;
	}
	public int getAltura() {
		return this.altura;
	}
	public void setRemolque (Remolque remolque) {
		this.remolque=remolque;
	}
	public Remolque getRemolque() {
		return this.remolque;
	}
	@Override
	public String toString() {
	return String.format("matricula %s", matricula);
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println("altura "+ altura);
		System.out.println("remolque "+ remolque);
		super.mostrarDatos();
		
	}
	public Camion (String matricula, String tipo,int vMaxima, int altura) {
		super(matricula, tipo, vMaxima);
		this.altura=altura;
		
	}
	

}
