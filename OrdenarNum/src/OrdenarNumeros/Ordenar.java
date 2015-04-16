package OrdenarNumeros;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ordenar {
	
	static int arreglo[]={2,0,-1,2,3,};
	private int aux,indice1,indice2;
	private int aux2=0;
	private int aux3=0;
	//ArrayList lista=new ArrayList<>();

	public void ordenarNum(){
              
		for(indice1=0;indice1<arreglo.length-2;indice1++){
			for(indice2=indice1+1;indice2<=arreglo.length-1;indice2++){
				if(arreglo[indice1]>arreglo[indice2]){
					aux=arreglo[indice1];
					arreglo[indice1]=arreglo[indice2];
					arreglo[indice2]=aux;
					//lista.add(arreglo[indice2]);
				}
			}
		}
		System.out.println("ASCENDENTE");
		for(indice2=0;indice2<arreglo.length;indice2++){
			System.out.println(arreglo[indice2]);	
		}
		
	}
	  public static Set union(Set a) {
	        Set res = new TreeSet();
	        res.addAll(a);
	        return res;
	        }
		public static void main(String[]args){
			Ordenar jeje=new Ordenar();
			jeje.ordenarNum();
			 System.out.println("Array A: " + Arrays.toString(arreglo));
		       System.out.println("recorrer");
		        List<Integer> recorrido=new ArrayList(Arrays.asList(arreglo));
		        Iterator iter=recorrido.iterator();
		        while (iter.hasNext()) {
					System.out.println(iter.next()+"--------");
					
				}
		        //System.out.println();
		        System.out.println("Lista LA: " + recorrido);
		        Set<Integer> a=new TreeSet(Arrays.asList(arreglo));
		        System.out.println("\nCONJUNTOS:");
		        System.out.println("Conjunto A: " + a);
		        Set c = union(a);
		        System.out.println("Union: " + c);
		        
			
		    }

	
}
