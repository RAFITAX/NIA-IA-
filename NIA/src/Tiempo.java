import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class Tiempo {

	public void tiempoActual() {
		 final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date = new Date();
	      System.out.println("Estamos a "+sdf.format(date));
	}
}
