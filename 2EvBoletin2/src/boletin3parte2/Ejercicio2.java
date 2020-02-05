package boletin3parte2;

public class Ejercicio2 {

	public static void main(String[] args) {

		Figura[] arrayFiguras = { new Triangulo(3, 2), new Cuadrado(5), new Triangulo(15, 3), new Triangulo(8, 7),
				new Rectangulo(9, 5), new Rectangulo(15, 6), new Circulo(5), new Circulo(9), new Rectangulo(8, 3),
				new Cuadrado(9) };

		Triangulo t1 = new Triangulo(15, 63);
		Circulo c1 = new Circulo(5);
		Rectangulo r1 = new Rectangulo(150, 563);
		Cuadrado cu1 = new Cuadrado(55);

		t1.calcularArea();
		System.out.println("Area Triangulo: " + t1.getArea());
		c1.calcularArea();
		System.out.println("Area Circulo: " + c1.getArea());
		r1.calcularArea();
		System.out.println("Area Rectangulo: " + r1.getArea());
		cu1.calcularArea();
		System.out.println("Area Cuadrado: " + cu1.getArea());
		array(arrayFiguras);

	}

	public static void array(Figura[] arrayFiguras) {
		Cuadrado[] arrayCuadrados = new Cuadrado[arrayFiguras.length];
		Triangulo[] arrayTriangulo = new Triangulo[arrayFiguras.length];
		Circulo[] arrayCirculo = new Circulo[arrayFiguras.length];
		Rectangulo[] arrayRectangulo = new Rectangulo[arrayFiguras.length];
		int j = 0;
		
		for (int i = 0; i < arrayFiguras.length; i++) {
			arrayFiguras[i].calcularArea();
			//triangulo
			if (arrayFiguras[i] instanceof Triangulo) {
				arrayTriangulo[j] = (Triangulo) arrayFiguras[i];
				j++;
			}
			//cuadrado
			if (arrayFiguras[i] instanceof Cuadrado) {
				arrayCuadrados[j] = (Cuadrado) arrayFiguras[i];
				j++;
			}
			//rectangulo
			else if (arrayFiguras[i] instanceof Rectangulo) {

				arrayRectangulo[j] = (Rectangulo) arrayFiguras[i];
				j++;
			}
			//circulo
			if (arrayFiguras[i] instanceof Circulo) {

				arrayCirculo[j] = (Circulo) arrayFiguras[i];
				j++;
			}
			
		}
		//triangulo
		System.out.println("array triangulos: ");
		for (Triangulo tri1 : arrayTriangulo) {
			if (tri1 == null) {
			} else {
				System.out.println(tri1+"\n");
			}
		}
		//cuadrado
		System.out.println("array cuadrados: ");
		for (Cuadrado cuad1 : arrayCuadrados) {
			if (cuad1 == null) {
			} else {
				System.out.println(cuad1+"\n");
			}
		}
		//rectangulo
		System.out.println("array rectangulo: ");
		for (Rectangulo rec1 : arrayRectangulo) {
			if (rec1 == null) {
			} else {
				System.out.println(rec1+"\n");
			}
		}
		//circulo
		System.out.println("array circulo: ");
		for (Circulo cir1 : arrayCirculo) {
			if (cir1 == null) {
			} else {
				System.out.println(cir1+"\n");
			}
		}
		
	}

}
