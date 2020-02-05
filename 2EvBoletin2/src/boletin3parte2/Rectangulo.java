package boletin3parte2;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	
	public Rectangulo (double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public void setBase (double base) {
		this.base=base;
	}
	public double getBase() {
		return this.base;
	}
	
	public void setAltura (double altura) {
		this.altura=altura;
	}
	public double getLado() {
		return this.altura;
	}
	
	public void calcularArea() {
		this.setArea(base*altura);
	}
	@Override
	public String toString() 
	{
		return String.format("Base %s \n Altura %s \n Area %s ", base,altura, getArea());
	}
}
