import java.util.Scanner;


public class ejercicio01 {
	public static void main(String[]args){
		Scanner leerDatos=new Scanner(System.in);
		int n;
		int c=1;
		System.out.println("introduce el valor de n:");
		n=leerDatos.nextInt();
		while(c<=n){
			System.out.println("numeros del 1 al "+n+": "+c);
			c++;
		}
		
	}

}
