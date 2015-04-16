package Pila;

public class Pila2 {
	private int[]arreglo;
	private int cima;
	
	public Pila2(){
		this.arreglo=new int[100];
		this.cima=-1;
	}
	public boolean esVacia(){
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
		/*System.out.println("Valor Desapilado: "+(a));*/
		return a;
	}
	public void vaciar(Pila2 B){
		while(!B.esVacia()){
			this.apilar(B.desapilar());
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
		Pila2 otro=new Pila2();
		while(!esVacia()){
			int a =desapilar();
			System.out.println(" " + a);
            otro.apilar(a);
		}this.vaciar(otro);
	}

}
