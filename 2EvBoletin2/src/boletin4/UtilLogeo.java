package boletin4;
public class UtilLogeo {

	public static Usuario realizarLogin (String nombreUsuario,String contraseña) throws LoginUsuarioNoExistente {
		Usuario[] arrayUsuarios= {
				new Usuario("fer1", "123456"),
				new Usuario("luis86", "000000"),
				new Usuario("ana_cps2002", "AzLmR56"),
				new Usuario("MariaFernandez", "655786995"),
				new Usuario("JZm46Y", "zxcvbnm"),
				new Usuario("___121aZ", "qwerty"),
				new Usuario("M.Rajoy", "password"),
				new Usuario("", "666666"),
				};
		
		//bucle
		for (int i = 0; i < arrayUsuarios.length; i++) {
		
			
				if(arrayUsuarios[i].getNombreUsuario().equals(nombreUsuario))
				{				
						
						if(arrayUsuarios[i].getContraseña().equals(contraseña))
						{
							return arrayUsuarios[i];
						}
				}
			
				System.out.println("No es valor numerico");
				LoginUsuarioNoExistente excep=new LoginUsuarioNoExistente("El Usuario no existe");
				//throw excep;
			
		
		}
		return null;
}
}

//falta excepciones y comprobar contraseña