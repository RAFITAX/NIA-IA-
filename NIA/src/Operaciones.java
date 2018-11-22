
public class Operaciones {
	public void opera() {
		System.out.println("Que tipo de operacion quieres hacer [suma/resta/multiplicar/division/potenciar]");
 		String tipo=Leer.dato();
 		System.out.println("Deme la Variable 1 ");
 		double var1=Leer.datoInt();
 		System.out.println("Deme la Variable 2 ");
 		double var2=Leer.datoInt();
 		switch(tipo) {
 			case "suma":
 				double suma=var1+var2;
 				System.out.println("La suma de "+var1+" + "+var2+" = "+suma);
 				break;
 			case "resta":
 				double resta=var1-var2;
				System.out.println("La resta de "+var1+" - "+var2+" = "+resta);
				break;
 			case "multiplicar":
 	 			double multiplicar=var1*var2;
 				System.out.println("La multiplicacion de "+var1+" * "+var2+" = "+multiplicar);
 				break;
 			case "dividir":
 	 			double dividi=var1/var2;
 				System.out.println("La division de "+var1+" / "+var2+" = "+dividi);
 				break;
 			default:
 				System.out.println("Esta operacion no esta dentro de mis capacidades");
 				break;
 		}
 					
 		}
	}
