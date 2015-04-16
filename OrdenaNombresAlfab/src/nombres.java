import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class nombres {
	public static void main(String []args)throws IOException {
		
		Scanner datos=new Scanner(System.in);
		int nombres[] =new int[10];
	    ArrayList<String> lista = new ArrayList<String>(); 

	    for(int i = 0; i <nombres.length; i++){
	    	System.out.println("Introduce Nombre "+(i+1));
	    	//for(int x=0;x<nombres[3].length;i++){
	    	//System.out.println("Introduce Apellido P "+(i+1));
	    	//System.out.println("Introduce Apellido M "+(i+1));
			nombres[i]=datos.nextInt();
			
			//lista.add(nombres[i][x]);
			//}
			
	    }
	   
	    Collections.sort(lista);
	    for(int x=0;x<nombres.length;x++){
	    System.out.println(lista.get(x)); 
	    }
	    datos.close();
	    }
	}
