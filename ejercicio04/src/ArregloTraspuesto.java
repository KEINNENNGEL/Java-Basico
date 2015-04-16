
public class ArregloTraspuesto {
	
	public int [][]traspuesto(int arreglo[][]){
		
		 int [][] traspuesta = new int [arreglo.length][arreglo.length];
	        for( int i=0; i<arreglo.length; i++ )
	            for( int j=0; j<arreglo.length; j++ )
	                traspuesta[i][j] = arreglo[j][i];
	   
	        return traspuesta;
	}

}
