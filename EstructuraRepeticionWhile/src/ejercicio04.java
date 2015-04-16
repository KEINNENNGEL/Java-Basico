import java.util.Scanner;


public class ejercicio04 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		int c=1;
		double a=0;
		int n=0;
		double saldo=0.0;
		System.out.println("introduce el valor de n:");
		n=leerDato.nextInt();
		while(c<=n){
			System.out.println("introduce tu saldo:");
			saldo=leerDato.nextDouble();
			a=a+saldo;
			c++;
			System.out.println("la nomina del sueldo: "+a);
		}
		
	}

}
