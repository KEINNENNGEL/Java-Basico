import java.util.Scanner;


public class ejercicio03 {
	public static void main(){
		Scanner leerDato=new Scanner(System.in);
		double n1;
		double lado;
		double radio;
		double base;
		double altura;
		int opcion;
		System.out.println("introduce la opcion:");
		System.out.println("1.-Area de triangulo");
		System.out.println("2.-Area de cuadrado");
		System.out.println("3.-Area de circulo");
		System.out.println("4.-Area de rectangulo");
		opcion=leerDato.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("introduce la base:");
			base=leerDato.nextDouble();
			System.out.println("intrduce la altura");
			altura=leerDato.nextDouble();
			double areaTriangulo=(base*altura)/2;
			System.out.println("resultado: "+areaTriangulo);
			break;
		case 2:
			System.out.println("introduce el lado");
			lado=leerDato.nextDouble();
			double ladoCua=lado*lado;
			System.out.println("resultado: "+ladoCua);
		break;
		case 3:
			System.out.println("introduce el radio");
			radio=leerDato.nextDouble();
			double radioC=radio*radio*3.1415;
			System.out.println("resultado: "+radioC);
			break;
		case 4:
			System.out.println("introduce la base:");
			base=leerDato.nextDouble();
			System.out.println("introduce la altura");
			altura=leerDato.nextDouble();
			double areaRect=base*base;
			System.out.println("resultado: "+areaRect);
			break;
		
		}
	}

}
