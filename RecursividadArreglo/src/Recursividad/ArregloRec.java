package Recursividad;

public class ArregloRec {
	
	public void imprimirArreglo(String arreglo[],int iterador){
		if(iterador>=arreglo.length){
			return ;
		}else{
			System.out.println(iterador+"---"+arreglo[iterador]);
			imprimirArreglo(arreglo,++iterador);
		}
}
	
	public static void main(String[]args){
		ArregloRec datos=new ArregloRec();
		String arreglo[]={"Miguel","Angel","otro","jejejejej","sdfvudvfiudef","dbvfudvf"};
		datos.imprimirArreglo(arreglo,5);
		System.out.println((8+9.35+9.7)/3);
		
	}

}
