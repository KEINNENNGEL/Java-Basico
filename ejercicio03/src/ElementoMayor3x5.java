
public class ElementoMayor3x5 {
	
	public int numMayor(int [][]arreglo){
		int mayor=0;
		for(int i=0;i<arreglo.length;i++){
			for(int j=0;j<arreglo[0].length;j++){
				if(mayor<arreglo[i][j]){
					mayor=arreglo[i][j];
					//System.out.println(mayor);
				}
			}
		}
		return mayor;
	}
	
}