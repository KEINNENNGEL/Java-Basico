import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;


public class ejercicio01 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		System.out.println("introduce el numero 1");
		n1=leerDato.nextInt();
		System.out.println("introduce el numero 2");
		n2=leerDato.nextInt();
		System.out.println("introduce el numero 3");
		n3=leerDato.nextInt();
		if(n1>n2&&n1>n3){
			System.out.println("es mayor: "+n1);
		}else if(n2>n1&&n2>n3){
			System.out.println("Es mayor: "+n2);
		}else{
			System.out.println("es mayor: "+n3);
		}
		
	}

}
