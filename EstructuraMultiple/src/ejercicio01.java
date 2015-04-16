import java.util.Scanner;


public class ejercicio01 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		double pago=0.0;
		int opcion;
		double desc=0;
		double cantFin=0.0;
		System.out.println("introduce el pago");
		pago=leerDato.nextDouble();
		System.out.println("Seleccione alguna bolita: Introduciendo el numero que corresponde:"); 
		System.out.println("1.-blanco,2.-verde,3.-amarillo,4.-azul,5.-rojo");
		opcion=leerDato.nextInt();
		switch (opcion) {
		case 1:
			desc=0;
			cantFin=pago-(pago*desc/100);
			System.out.println("Cantidad : "+cantFin);
			break;
		case 2:
			desc=10;
			cantFin=pago-(pago*desc/100);
			System.out.println("Cantidad : "+cantFin);
			break;
		case 3:
			desc=25;
			cantFin=pago-(pago*desc/100);
			System.out.println("Cantidad : "+cantFin);
			break;
		case 4:
			desc =50;
			cantFin=pago-(pago*desc/100);
			System.out.println("Cantidad : "+cantFin);
			break;
		case 5:
			desc =100;
			cantFin=pago-(pago*desc/100);
			System.out.println("Cantidad : "+cantFin);
			break;
		default :
			desc =0;
		cantFin=pago-(pago*desc/100);
		System.out.println("Cantidad : "+cantFin);
		break;
			
		}
		
	}

}

