import java.util.Scanner;


public class ejercicio01 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		int c=1;
		int n=0;
		System.out.println("Introduce un valor");
		n=leerDato.nextInt();
		do{
			System.out.println(c);
			c=c+2;
		}while(c<=n);
	}

}
