package boletin3parte2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		
		Triangulo t1 = new Triangulo(15,63);
		Circulo c1 = new Circulo(5);
		Rectangulo r1 = new Rectangulo(150,563);
		Cuadrado cu1 = new Cuadrado(55);
		
		t1.calcularArea();
		System.out.println("Area Triangulo: " + t1.getArea());
		c1.calcularArea();
		System.out.println("Area Circulo: " + c1.getArea());
		r1.calcularArea();
		System.out.println("Area Triangulo: " + r1.getArea());
		
		//terminar impresion cuadrado como los de arriba
		r1.calcularArea();
		System.out.println("Area Triangulo: " + r1.getArea());
		
		
	}

}
