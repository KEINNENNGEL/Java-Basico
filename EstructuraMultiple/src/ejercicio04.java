import java.util.Scanner;


public class ejercicio04 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		int mes;
		double cantArt;
		double fact;
		double cantFin=0.0;
		System.out.println("Introduce el mes en numerico:");
		mes=leerDato.nextInt();
		System.out.println("introduce la cantidad del art");
		cantArt=leerDato.nextDouble();
		switch(mes){
		case 1:
			fact=15;
			cantFin=cantArt*fact;
			System.out.println("Resultado: "+cantFin);
			break;
		case 2:
			fact =17;
			cantFin=cantArt*fact;
			System.out.println("Resultado: "+cantFin);
			break;
		case 4:
			fact=20;
			cantFin=cantArt*fact;
			System.out.println("Resultado: "+cantFin);
			break;
		default:
			fact =0;
		cantFin=cantArt*fact;
		System.out.println("Resultado: "+cantFin);
			break;
		}
	}

}
