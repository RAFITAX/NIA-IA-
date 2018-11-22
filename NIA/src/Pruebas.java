
public class Pruebas {
	public void laPrueba() {
		System.out.println("Deme el programa a abrir ");
		String program=Leer.dato();
		if (program.equalsIgnoreCase("notepad")) {
			try 
			{ 
				 Runtime.getRuntime().exec ("cmd /c start notepad++"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("notepad no funciona");
			}
		}//CIERRO EL IF
		else if(program.equalsIgnoreCase("calculadora")) {
			try 
			{ 
				/* directorio/ejecutable es el path del ejecutable y un nombre */ 
				Runtime.getRuntime().exec ("cmd /c start calc"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("calculadora no funciona");/* Se lanza una excepción si no se encuentra en ejecutable o el fichero no es ejecutable. */ 
			}
		}//CIERRO EL ELSE IF
		else if(program.equalsIgnoreCase("steam")) {
			try 
			{ 
				/* directorio/ejecutable es el path del ejecutable y un nombre */ 
				Runtime.getRuntime().exec ("D:\\Steam\\Steam.exe"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("steam no funciona");
			}
		}//CIERRO EL ELSE IF
		else if(program.equalsIgnoreCase("eclipse")) {
			try 
			{ 
				 Runtime.getRuntime().exec ("C:\\Users\\LUIS\\eclipse\\java-2018-09\\eclipse\\eclipse"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("eclipse no funciona");
			} 
		}//CIERRO EL ELSE IF
		else if(program.equalsIgnoreCase("battle.net")) {
			try 
			{ 
				 Runtime.getRuntime().exec ("D:\\BattleNET\\Battle.net\\Battle.net Launcher"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("battle.net no funciona");
			} 
		}//CIERRO EL ELSE IF
		else if(program.equalsIgnoreCase("discord")) {
			try 
			{ 
				 Runtime.getRuntime().exec ("C:\\Users\\LUIS\\AppData\\Local\\Discord\\app-0.0.301\\Discord"); 
			} 
			catch (Exception e) 
			{ 
				System.out.println("Discord no funciona");
			} 
		}//CIERRO EL ELSE IF
	}//CIERRO EL METODO
}//CIERRO LA CLASE  //D:\BattleNET\Battle.net

