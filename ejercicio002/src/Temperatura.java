
public class Temperatura {
	
	public int[] temperaturas(int valores[]){
		for(int i=0;i<valores.length;i++){
			System.out.println(valores[i]);
		}
		return valores;
	}
	public int[] Insercion(int[] arreglo){ 
		
	      for (int indice=1; indice < arreglo.length; indice++) {   
	         int aux = arreglo[indice];    
	         int indice2;
	         for (indice2=indice-1; indice2 >=0 && arreglo[indice2] > aux; indice2--){  
	              arreglo[indice2+1] = arreglo[indice2];  
	          }  
	         arreglo[indice2+1] = aux;  
	      }
	      return arreglo;
	   }
	public int media(int datos[]){
		int aux;
		aux=datos.length/2;
		//System.out.println(aux=datos.length/2);
		return aux;
	}
}
