package boletin3parte2;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado (double lado) {
		super(lado, lado);
	}
	
	public void setLado (double lado) {
		this.setBase(lado);
		this.setAltura(lado);
	}
	public double getLado() {
		return this.getBase();
	}
	
}