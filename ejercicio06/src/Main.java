import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		String respuesta;
		System.out.println("Introduce un Palindromo");
		respuesta=dato.next();
	      boolean resultado=Palindromo.espalindromo(respuesta.toUpperCase().
	    		  replace('�', 'a').replace('�','e').replace('�', 'i').replace('�', 'o')
	    		  .replace('�', 'u').replace('�', 'A').replace('�', 'E').replace('�', 'I')
	    		  .replace('�','O').replace('�', 'U'));
	      if(resultado==true){
	          System.out.println(respuesta.toUpperCase());
	          System.out.println(resultado+" \nEs un palindromo".toUpperCase());
	          
	          
	      }else{
	          System.out.println("no lo es");
	      
	      }
	    }
}
