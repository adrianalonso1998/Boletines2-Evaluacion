package boletin3parte2;

public class Cuadrado extends Rectangulo {

	public Cuadrado(double lado) {
		super(lado, lado);
	}

	public void setLado(double lado) {
		this.setBase(lado);
		this.setAltura(lado);
	}

	public double getLado() {
		return this.getBase();
	}

	@Override
	public String toString() {
		return String.format("\tlado %s \n\tArea %s ", getLado(), getArea());
	}
	public void imprimirFiguras() {
		System.out.println("Base " + getBase());
		System.out.println("Area " + getArea());
		System.out.println("Altura " + getPerimetro());
	}
}
