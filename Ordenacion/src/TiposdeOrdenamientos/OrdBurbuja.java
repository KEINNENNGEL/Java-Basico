package TiposdeOrdenamientos;

public class OrdBurbuja {
	
	public static int[] burbuja(int[]arreglo){  
        int aux;
        for(int iterador=1;iterador < arreglo.length;iterador++){  
            for (int j=0 ; j < arreglo.length- 1; j++){  
                if (arreglo[j] > arreglo[j+1]){  
                    aux = arreglo[j];  
                    arreglo[j] = arreglo[j+1];  
                    arreglo[j+1] = aux;  
                }
            }
        }
        return arreglo;
    }
}
