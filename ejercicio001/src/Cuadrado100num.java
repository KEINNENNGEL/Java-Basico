
public class Cuadrado100num {
	int arreglo[]=new int [100];
	
	public void numeros(){
		int i;
		int aux[]=new int [100];
		int otro;
		for(i=1;i<arreglo.length;i++){
			arreglo[i]=i*i;
		}
		for(i=1;i<arreglo.length;i++){
		System.out.println("Numero: "+i+" Al Cuadrado: "+arreglo[i]);
		}
	}

}
