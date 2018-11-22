
public class AbrirProgramas {
	
	public void abrirPro() {
		System.out.println("Deme el programa a abrir ");
		String program=Leer.dato();
		switch(program) {
		case "calculadora":
			try 
			{ 
				/* directorio/ejecutable es el path del ejecutable y un nombre */ 
				Runtime.getRuntime().exec ("cmd /c start calc"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("calculadora no funciona");/* Se lanza una excepción si no se encuentra en ejecutable o el fichero no es ejecutable. */ 
			}
			break;
		/*case "navegador":
			try 
			{ 
				
				Runtime.getRuntime().exec ("cmd /c start chrome"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("chrome no funciona");
			}*/
		case "notepad":
			try 
			{ 
				 Runtime.getRuntime().exec ("cmd /c start notepad++"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("notepad no funciona");
			}
		case "steam":
			try 
			{ 
				/* directorio/ejecutable es el path del ejecutable y un nombre */ 
				Runtime.getRuntime().exec ("D:\\Steam\\Steam.exe"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("steam no funciona");
			}
		case "eclipse":
			try 
			{ 
				 Runtime.getRuntime().exec ("C:\\Users\\LUIS\\eclipse\\java-2018-09\\eclipse\\eclipse"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("eclipse no funciona");
			} 
		}
	}
}
