import java.util.Scanner;

public class ejercicio02 {
	public static void main(){
	Scanner leerDato=new Scanner(System.in);
	int opcion;
	System.out.println("introduce un numero del 1 al 7 para saber el dia:");
	opcion=leerDato.nextInt();
	switch (opcion) {
	case 1:
		System.out.println("lunes");
		break;
	case 2:
		System.out.println("martes");
		break;
	case 3:
		System.out.println("miercoles");
		break;
	case 4:
		System.out.println("jueves");
		break;
	case 5:
		System.out.println("viernes");
		break;
	case 6:
		System.out.println("sabado");
		break;
	case 7:
		System.out.println("domingo");
		break;
	}
	}
}
