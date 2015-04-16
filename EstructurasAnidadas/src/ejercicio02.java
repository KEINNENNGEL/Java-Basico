import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.LLOAD;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


public class ejercicio02 {
	public static void main(String[]args){
		Scanner leerDato=new Scanner(System.in);
		double pago=0.0;
		String bolita="";
		double cantFin=0.0;
		System.out.println("introduce el pago");
		pago=leerDato.nextDouble();
		System.out.println("Seleccione alguna bolita y escribala:"); 
		System.out.println("blanco,verde,amarillo,azul,rojo");
		bolita=leerDato.next();
		if(bolita.equals("blanco")){
			cantFin=pago;
			System.out.println("cantidad final: "+cantFin);
		}else if(bolita.equals("verde")){
			cantFin=pago-(pago*0.10);
			System.out.println("Cantidad final: "+cantFin);
		}else if(bolita.equals("amarillo")){
			cantFin=pago-(pago*0.25);
			System.out.println("cantidad final: "+cantFin);
		}else if(bolita.equals("azul")){
			cantFin=pago-(pago*0.50);
			System.out.println("cantidad final: "+cantFin);
		}else if(bolita.equals("rojo")){
			cantFin=pago-pago;
			System.out.println("cantidad final: "+cantFin);
		}else{
			System.out.println("esa bolita no existe");
		}
	}

}
