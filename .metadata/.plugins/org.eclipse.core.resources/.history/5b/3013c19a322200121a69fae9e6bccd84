package TiposdeOrdenamientos;

public class Main {
	
	public static void main(String[]args){
		
		int arreglo[]={5,3,8,1,0,8,1,7,5,8,9,4};
		
		OrdBurbuja bur=new OrdBurbuja();
		int datos[]=bur.burbuja(arreglo);
		System.out.println("Metodo Burbuja");
		for(int i=0;i<datos.length;i++){
		System.out.println(datos[i]);
		}
		
		OrdenacionXInsercion ins=new OrdenacionXInsercion();
		int datos2[]=ins.Insercion(arreglo);
		System.out.println("Metodo Insercion");
		for(int i=0;i<datos.length;i++){
			System.out.println(datos2[i]);
			}
		
		OrdRapido rapido=new OrdRapido();
		//int []datos3=rapido.Rapido(arreglo, 0, 9);
		System.out.println("Metodo QuickSort");
		rapido.Rapido(arreglo, 0,0);
		
		OrdSell sell=new OrdSell();
		int datos3[]=sell.shellSort(arreglo);
		System.out.println("Metodo Sortsell");
		for(int i=0;i<datos.length;i++){
			System.out.println(datos3[i]);
			}
		
		OrdSeleccion sel=new OrdSeleccion();
		int datos5[]=sel.Seleccion(arreglo);
		System.out.println("Metodo Seleccion");
		for(int i=0;i<datos.length;i++){
			System.out.println(datos5[i]);
			}
	}

}
