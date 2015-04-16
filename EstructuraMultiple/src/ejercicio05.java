import java.util.Scanner;


public class ejercicio05 {
	public static void main(String[]args){
	int tipo;
	Scanner leeDato=new Scanner(System.in);
	String planta="";
	int cama;
	System.out.println("Que tipode habitacion quiere:");
	System.out.println("1.-azul");
	System.out.println("2.-rojo");
	System.out.println("3.-verde");
	System.out.println("4.-rosa");
	System.out.println("5.-gris");
	tipo=leeDato.nextInt();
	switch (tipo) {
	case 1:
		cama=2;
		planta="primera";
		System.out.println("el numero de cama es: "+cama+" y la planta es: "+planta);
		break;
	case 2:
		cama=1;
		planta="primera";
		System.out.println("el numero de cama es: "+cama+" y la planta es: "+planta);
		break;
	case 3:
		cama=3;
		planta="segunda";
		System.out.println("el numero de cama es: "+cama+" y la planta es: "+planta);
		break;
	case 4:
		cama=2;
		planta="segunda";
		System.out.println("el numero de cama es: "+cama+" y la planta es: "+planta);
		break;
	case 5:
		cama=1;
		planta="tercera";
		System.out.println("el numero de cama es: "+cama+" y la planta es: "+planta);
		break;
		default:
			System.out.println("tipo de habitacion no establecida");
			cama=0;
			planta="";
			break;
		
	}
	}
}
