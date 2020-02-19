package boletin3parte2;

public class Circulo extends Figura {

	private double radio;
	private static final double CONSTANTE_PI = 3.14159265358979323846264338327950288419716939937510;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return this.radio;
	}

	public void calcularArea() {
		this.setArea(2 * CONSTANTE_PI * radio);
	}

	@Override
	public String toString() {
		return String.format("\tRadio %s \n\tArea %s ", radio, getArea());
	}

	@Override
	public void calcularPerimetro() {
		super.setPerimetro(2 * CONSTANTE_PI * radio);

	}

	public void imprimirFiguras() {
		System.out.println("Radio " + radio);
		System.out.println("Area " + getArea());
		System.out.println("Altura " + getPerimetro());
	}
}
