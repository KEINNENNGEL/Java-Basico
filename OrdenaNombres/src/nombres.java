import java.awt.font.NumericShaper;
import java.util.Scanner;


public class nombres {
	
	public static void main(String[]args){
		
		Scanner datos=new Scanner(System.in);
		String nombres[]=new String[10];
		int x=0,i;
		String comparar="";
		for(i=1;i<nombres.length;i++){
			System.out.println("Introduce Nombre "+(i));
			nombres[i]=datos.next();
			comparar=nombres[i];
			x=i;
			while(x > 0 && nombres[x-1].compareTo(comparar)> 0){
				nombres[x]=nombres[x-1];
					}
			nombres[x]=comparar;
			System.out.println(nombres[x]);
		}
		datos.close();
	}

}
