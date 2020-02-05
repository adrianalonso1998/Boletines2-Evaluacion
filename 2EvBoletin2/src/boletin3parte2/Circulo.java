package boletin3parte2;

public class Circulo extends Figura {

	private double radio;
	private static double CONSTANTE_PI= 3.1416;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public void setRadio (double radio) {
		this.radio=radio;
	}
	public double getRadio() {
		return this.radio;
	}
	public void calcularArea() {
		this.setArea(2*CONSTANTE_PI*radio);
	}
	@Override
	public String toString() 
	{
		return String.format(" Radio %s \n Area %s ", radio, getArea());
	}
}
