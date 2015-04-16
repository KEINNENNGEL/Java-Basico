package PilaObjeto;

//7import Pila.Pila2;

public class Pila {
	private int[]arreglo=new int [100];
	private int cima;
	
	public Pila(int nuevaDimencion){
		this.arreglo=new int[nuevaDimencion];//agregamos una nueva dimencion al arreglo
		this.cima=-1;
	}
	public boolean esVacia(){
		System.out.println("Es vacio:"+(cima==-1));
		return cima==-1;
	}
	public void apilar(int a){
		cima++;
		arreglo[cima]=a;
	}
	public int desapilar(){
		int a=Integer.MIN_VALUE;
		if(esVacia()){
			System.out.println("Pila Vacia");
		}else{
			a=arreglo[cima];
			cima--;
		}
		System.out.println("Valor Desapilado: "+(a));
		return a;
	}
	public void vaciar(Pila B){
		while(!B.esVacia()){
			this.apilar(B.desapilar());
			System.out.println("Vaciando Pila: "+B);
			}
		}
	public int tamanio(){
		System.out.println("El Tamaño es : "+(cima+1));
		return cima+1;
	}
	public int cima(){
		System.out.println("La cima es: "+arreglo[cima]);
		return arreglo[cima];
	}
	public void mostrar(){
		System.out.println("Valores de la pila: ");
		for(int contador=arreglo.length-1;contador>=0;contador--){
				System.out.println("\t"+arreglo[contador]);
				}
	}

}
