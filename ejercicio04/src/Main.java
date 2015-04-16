
public class Main {
	public static void main(String[]args){
		int arreglo[][]=new int [6][7];
		int aux[][]=new int [7][6];
		arreglo[0][0]=1;
		arreglo[0][1]=2;
		arreglo[0][2]=3;
		arreglo[0][3]=4;
		arreglo[0][4]=5;
		arreglo[0][5]=6;
		arreglo[0][6]=7;
		
		arreglo[1][0]=1;
		arreglo[1][1]=2;
		arreglo[1][2]=3;
		arreglo[1][3]=4;
		arreglo[1][4]=5;
		arreglo[1][5]=6;
		arreglo[1][6]=7;
		
		arreglo[2][0]=1;
		arreglo[2][1]=2;
		arreglo[2][2]=3;
		arreglo[2][3]=4;
		arreglo[2][4]=5;
		arreglo[2][5]=6;
		arreglo[2][6]=7;
		
		arreglo[3][0]=1;
		arreglo[3][1]=2;
		arreglo[3][2]=3;
		arreglo[3][3]=4;
		arreglo[3][4]=5;
		arreglo[3][5]=6;
		arreglo[3][6]=7;
		
		arreglo[4][0]=1;
		arreglo[4][1]=2;
		arreglo[4][2]=3;
		arreglo[4][3]=4;
		arreglo[4][4]=5;
		arreglo[4][5]=6;
		arreglo[4][6]=7;
		
		arreglo[5][0]=1;
		arreglo[5][1]=2;
		arreglo[5][2]=3;
		arreglo[5][3]=4;
		arreglo[5][4]=5;
		arreglo[5][5]=6;
		arreglo[5][6]=7;
		System.out.println("\n\nSin traspasar");
		for(int i=0;i<arreglo.length;i++){
			System.out.println(" 	");
			for(int j=0;j<arreglo.length;j++){
				System.out.print(arreglo[i][j]+"	");
			}
		}
		ArregloTraspuesto o=new ArregloTraspuesto();
		aux=o.traspuesto(arreglo);
		System.out.println("\n\ntraspasado");	
		for(int ii=0;ii<aux.length;ii++){
			System.out.println(" 	");
			for(int j=0;j<aux.length;j++){
				System.out.print(aux[ii][j]+"	");
			}
			
		}
	}
}
