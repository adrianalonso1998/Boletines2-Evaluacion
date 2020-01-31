package Boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {

		Coche coche1 = new Coche("1551 DHD", "coche", 150, 8);
		Conductor c1 = new Conductor("122346467h", "adolfo");
		Conductor c2 = new Conductor("79343377t", "Anxo");
		Vehiculo vehiculo1=new Vehiculo("1568 fgh","camion",160,c1);
		//
		Remolque remolque2 = new Remolque();
		remolque2.matricula = "1234 fgf";
		remolque2.longitud = 50;
		//
		coche1.setConductor(c1);
		Conductor conductor1 = new Conductor("123587496j", "Gustabo");
		coche1.setConductor(conductor1);
		//
		Remolque remolque1 = new Remolque();
		remolque1.matricula = "1589 dhf";
		remolque1.longitud = 51;
		//
		Camion camion1 = new Camion("1554 dgd", "camion", 150, remolque1);
		camion1.setAltura(66);
		camion1.setConductor(c2);
		coche1.mostrarDatos();
		// System.out.println(coche1.toString());

		camion1.mostrarDatos();
		// System.out.println(camion1.toString());

		impresionPolimorfismo(camion1);
		impresionPolimorfismo(coche1);
		impresionPolimorfismoCasteo(camion1);
		impresionPolimorfismoCasteo(camion1);
		
		Camion camion3=new Camion("4558 dfg", "camion", 200, 7 );
		camion3.mostrarDatos();
	}

	public static void impresionPolimorfismo(Vehiculo v1) {
		v1.mostrarDatos();
	}
	
	public static void impresionPolimorfismoCasteo(Vehiculo v2) {
		String tipo=v2.getTipo();
	if(tipo.equals("camion"));	
	{
		System.out.println(((Camion)v2).getRemolque());
	}
	}
	//como el de arriba pero de otra forma
	public static void impresionPolimorfismoCasteo2(Vehiculo v2) {
		String tipo=v2.getTipo();
		
	if(v2 instanceof Camion);	//si es una instancia de
	{
		System.out.println(((Camion)v2).getRemolque());
	}
	}
	
}
