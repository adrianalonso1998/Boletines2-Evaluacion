package boletin3parte2;

public class Rectangulo extends Figura {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return this.base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado() {
		return this.altura;
	}

	public void calcularArea() {
		this.setArea(base * altura);
	}

	@Override
	public String toString() {
		return String.format("\tBase %s \n\tAltura %s \n\tArea %s ", base, altura, getArea());
	}

	@Override
	public void calcularPerimetro() {
		super.setPerimetro(base + base + altura + altura);

	}

	public void imprimirFiguras() {
		System.out.println("Base " + base);
		System.out.println("Altura " + altura);
		System.out.println("Area " + getArea());
		System.out.println("Altura " + getPerimetro());
	}
}
