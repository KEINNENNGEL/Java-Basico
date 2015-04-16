package TiposdeOrdenamientos;

public class OrdSeleccion {
	
    public static int[] Seleccion(int[]matrix){ 
    	
        int i, j, k, p, buffer=0, limit = matrix.length-1;  
        for(k = 0; k < limit; k++){  
            p = k;  
            for(i = k+1; i <= limit; i++){  
                if(matrix[i] < matrix[p]) p = i;  
                if(p != k){  
                    buffer = matrix[p];  
                    matrix[p] = matrix[k];  
                    matrix[k] = buffer;  
                }  
                
            } 

        } 
        return matrix;
    }  
	}
