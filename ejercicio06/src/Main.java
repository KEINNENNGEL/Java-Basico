import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		String respuesta;
		System.out.println("Introduce un Palindromo");
		respuesta=dato.next();
	      boolean resultado=Palindromo.espalindromo(respuesta.toUpperCase().
	    		  replace('á', 'a').replace('é','e').replace('í', 'i').replace('ó', 'o')
	    		  .replace('ú', 'u').replace('Á', 'A').replace('É', 'E').replace('Í', 'I')
	    		  .replace('Ó','O').replace('Ú', 'U'));
	      if(resultado==true){
	          System.out.println(respuesta.toUpperCase());
	          System.out.println(resultado+" \nEs un palindromo".toUpperCase());
	          
	          
	      }else{
	          System.out.println("no lo es");
	      
	      }
	    }
}
