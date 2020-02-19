package boletin3parte2;

public abstract class Figura implements ICalculosFigura, IImpresionFigura {

	private double area;
	private double perimetro;

	public abstract void calcularArea();

	public abstract void calcularPerimetro();

	public abstract void imprimirFiguras();

	@Override
	public void imprimirPerimetro() {
		System.out.println(perimetro);
	}

	@Override
	public void imprimirArea() {
		System.out.println(area);
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getArea() {
		return this.area;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getPerimetro() {
		return this.perimetro;
	}
}
