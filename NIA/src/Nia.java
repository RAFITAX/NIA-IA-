public class Nia {

	public static void main(String[] args) {
		//CREO LOS OBJETOS
		Tiempo f1=new Tiempo();
		Operaciones f2=new Operaciones();
		AbrirProgramas f3=new AbrirProgramas();
		Navegar f4=new Navegar();
		Pruebas f5=new Pruebas();
		f1.tiempoActual();
		
		//Bienvenida
		System.out.println("--------------------Buenas soy NIA tu asistente personal-------------------");
		System.out.println("Que es lo que quieres hacer[operar/programa[testendo]/navegar[OFF]/prueba] ");
		String hacer=Leer.dato();
		//QUE ES LO QUE QUIERO QUE HAGA
		switch(hacer){ 
		 	case "operar":
		 		f2.opera();
		 		break;
		 	case "programa":
		 		f3.abrirPro();
		 		break;
		 	case "navegar":
		 		f4.navega();
		 		break;
		 	case "prueba":
		 		f5.laPrueba();
		 		break;
		 	default:
		 		System.out.println("Eres tonto cruck.Vuele a ejecutarlo de nuevo");
		 		break;
		}

	}


}
