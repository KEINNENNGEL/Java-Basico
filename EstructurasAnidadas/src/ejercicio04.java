import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


public class ejercicio04 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		int n;
		System.out.println("introduce un numero para saber el dia del 1 a 7");
		n=leerDato.nextInt();
		
		if(n==1){
			System.out.println("lunes");
		}else
		if(n==2){
			System.out.println("martes");
		}else
		if(n==3){
			System.out.println("miercoles");
		}else
		if(n==4){
			System.out.println("jueves");
		}else
		if(n==5){
			System.out.println("viernes");
		}else
		if(n==6){
			System.out.println("sabado");
		}else
		if(n==7){
			System.out.println("domingo");
		}
	}
}
