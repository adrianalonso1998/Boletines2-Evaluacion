package boletin4;

public class UtilObtencionDatos {
	public static double obtenerValorDouble(String numero) throws ValorNumericoNegativoException {
		double d = Double.valueOf(numero);
		if(d<0) {
			ValorNumericoNegativoException excep=new ValorNumericoNegativoException("El numero es negativo");
			throw excep;
			
			//throw new ValorNumericoNegativoException();
		}
		else
		{
			if(d==0)
			{
				throw new ValorNumericoNegativoException("El valor no puede ser 0");
			}
		}
		return d;
	}
}
