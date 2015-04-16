
public class Main {
	public static void main(String[]args){
		int arreglo[][]=new int [3][5];
		arreglo[0][0]=1;
		arreglo[0][1]=4;
		arreglo[0][2]=7;
		arreglo[0][3]=4;
		arreglo[0][4]=5;
		
		arreglo[1][0]=0;
		arreglo[1][1]=2;
		arreglo[1][2]=5;
		arreglo[1][3]=4;
		arreglo[1][4]=3;
		
		arreglo[2][0]=6;
		arreglo[2][1]=9;
		arreglo[2][2]=1;
		arreglo[2][3]=3;
		arreglo[2][4]=5;
		ElementoMayor3x5 o=new ElementoMayor3x5();
		int aux=o.numMayor(arreglo);
		System.out.println("Numero mayor: "+aux);
	}

}
