
public class Main {
	public static void main(String[]args){
	int arreglo1[][]=new int [5][2];
	int arreglo2[][]=new int [5][2];
	
	arreglo1[0][0]=0;
	arreglo1[0][1]=1;
	arreglo1[1][0]=2;
	arreglo1[1][1]=3;
	arreglo1[2][0]=4;
	arreglo1[2][1]=5;
	arreglo1[3][0]=6;
	arreglo1[3][1]=7;
	arreglo1[4][0]=8;
	arreglo1[4][1]=9;
	/**/
	arreglo2[0][0]=0;
	arreglo2[0][1]=1;
	arreglo2[1][0]=2;
	arreglo2[1][1]=3;
	arreglo2[2][0]=4;
	arreglo2[2][1]=5;
	arreglo2[3][0]=6;
	arreglo2[3][1]=7;
	arreglo2[4][0]=8;
	arreglo2[4][1]=9;
	
	ComparaArray o=new ComparaArray();
	boolean c=o.compara(arreglo1, arreglo2);
	System.out.println(c);
	
	
	}
}
