import java.util.Random;


public class Main {
	public static void main(String[]args){
		Random o=new Random();
		int temperaturasC[]=new int[60];
		
		for(int i=0;i<temperaturasC.length;i++){
			temperaturasC[i]=o.nextInt(50);
		}
		
		Temperatura t=new Temperatura();
		int []datos=t.temperaturas(temperaturasC);
		
		for(int i=0;i<datos.length;i++){
			System.out.println(datos[i]);
		}
		int datostem[]=t.Insercion(datos);
		System.out.println("Ordenanado para sacar la media");
		for(int i=0;i<datos.length;i++){
			System.out.println("Posicion "+i+" : "+datostem[i]);
		}
		int x=t.media(datos);
		//System.out.println("Media");
		//System.out.println(datostem[x]);
		 for(int i=0;i<datos.length;i++){
			 if(i==x){
				 System.out.println("Media: "+i+" \nValor: "+datos[i]);
			 }else if(datos[i]>=x){
				 System.out.println("Valores mayores o iguales: "+datos[i]);
			 }
		 }
	}

}
