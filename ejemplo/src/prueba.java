import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class prueba {
	public static void main( String args[] )
	   {
	      int respuestas[] = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
	         10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6,
	         4, 8, 6, 8, 10 };
	      int frecuencia[] = new int[ 11 ];
	 
	      // para cada respuesta, seleccionar el elemento de respuestas y usar ese valor
	      // como �ndice en frecuencia para determinar el elemento a incrementar
	      for ( int respuesta = 0; respuesta < respuestas.length; respuesta++ )
	         ++frecuencia[ respuestas[ respuesta ] ];
	 
	      String salida = "Calificaci�n\tFrecuencia\n";
	 
	      // anexar frecuencias al String salida
	      for ( int calificacion = 1; calificacion < frecuencia.length; calificacion++ )
	         salida += calificacion + "\t" + frecuencia[ calificacion ] + "\n";
	 
	      JTextArea areaSalida = new JTextArea();
	      areaSalida.setText( salida );
	 
	      JOptionPane.showMessageDialog( null, areaSalida,
	         "Programa de votaci�n de estudiantes", JOptionPane.INFORMATION_MESSAGE );
	 
	      System.exit( 0 );
	 
	   } // fin de main

}
