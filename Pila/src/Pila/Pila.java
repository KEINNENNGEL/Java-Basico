package Pila;

import java.awt.List;
import java.util.ArrayList;
	
public class Pila {
	int arreglo[]=new int [10];
	private int i;
	int tam;
	List lista=new List();
	ArrayList<Integer> lista2=new ArrayList<>();
	void apilar (int a){
		int i;
		for(i=0;i<arreglo.length;i++){
		arreglo[i]=a;
		lista2.add(arreglo[i]);
		}
		System.out.println(a+"	");
		
		//System.out.println("Tamaño: "+tam);
	}
	
	
	int tamanio(){
		System.out.println("Tamaño de la pila :"+lista2.isEmpty());
		return tam;
	}
	
	boolean esVacia(){
		boolean no=false;
		boolean si=true;
		for(i=0;i<arreglo.length;i++){
			if(arreglo[i]!=0){
				no=false;
				System.out.println("Posicion "+i+" Llena: "+no);
			}
			else{
				si=true;
				System.out.println("Posicion "+i+" Llena "+si);
			}
		}
		
		return si;
	}
	void desapilar(){/////
		arreglo[i]--;
		System.out.println("Desapilar: "+arreglo[i]);
	}
	void vaciar(){
		int i;
		int vacio[]=new int [11];
		for(i=0;i<arreglo.length;i++){
			arreglo[i]=vacio[i];
			System.out.println("Arreglo posicion "+i+" Vacia "+arreglo[i]);
		}
		
	}
	
	int cima(){
		int i;
		int aux=0;
		for(i=0;i<arreglo.length;i++){
			if(arreglo[i]!=0){
				aux=arreglo[i];
				
			}
		}
		System.out.println("Cima: "+aux);
		return aux;
	}

}
