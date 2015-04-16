
public class ComparaArray {
	public boolean compara(int[][]arreglo,int arreglo2[][]){
		int a=0;
		for(int i=0;i<arreglo.length;i++){
			for(int j=0;j<arreglo[0].length;j++){
				if(arreglo[i][j]==arreglo2[i][j]){
					a++;
					}else{
						return false;
					}
				}
			if(a==arreglo.length-1){
				return true;
			}
			}
		return true;
		}
	}
