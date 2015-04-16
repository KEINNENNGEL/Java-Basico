import java.util.Scanner;


public class ejercicio05 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		String turno="";
		int horas=0;
		double sueldo=0.0;
		System.out.println("Escribe algun turno de estos");
		System.out.println("mañana,noche,festivo");
		turno=leerDato.next();
		System.out.println("introduce las horas trabajadas:");
		horas=leerDato.nextInt();
		if(turno.equals("mañana")){
			sueldo=(horas*60)*5;
			System.out.println("tu sueldo del turno de mañana:");
			System.out.println(sueldo);
		}else if(turno.equals("noche")){
			sueldo=(horas*80)*5;
			System.out.println("tu sueldo del turno de noche:");
			System.out.println(sueldo);
		}else if(turno.equals("festivo")){
			sueldo=(horas*100)*5;
			System.out.println("sueldo del turno festivo:");
			System.out.println(sueldo);
		}
	}
}
