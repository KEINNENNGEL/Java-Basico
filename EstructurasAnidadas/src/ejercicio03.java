import java.util.Scanner;


public class ejercicio03 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		int n1;
		System.out.println("introduce el mes en forma numerico:");
		n1=leerDato.nextInt();
		if(n1==1 ||n1==2||n1==3){
			System.out.println("Primavera");
		}else if(n1==4||n1==5||n1==6){
			System.out.println("Verano");
		}else if(n1==7||n1==8||n1==9){
			System.out.println("Oto�o");
		}else if(n1==10||n1==11||n1==12){
			System.out.println("Invierno");
		}else{
			System.out.println("Introduce un numero valido");
		}
	}
}
