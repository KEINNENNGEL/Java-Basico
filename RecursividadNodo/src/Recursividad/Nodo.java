package Recursividad;

import java.awt.List;
import java.util.ArrayList;

public class Nodo {
	private List<Nodo> hijos;
	public Nodo() {
		hijos = new ArrayList<Nodo>();
	}

	public void addNodo(Nodo nodo){
		hijos.add(nodo);
	}

	public int numeroNodos(){
		return hijos.size();
	}

	public boolean esPadre(){
		if(hijos.size() == 0){
			return false;
		}else{
			return true;
		}
	}
	public List<Nodo> getHijos(){
		return hijos;
	}
	public int getNumeroDescendientes(Nodo nodo){
		int numeroHijos=nodo.numeroNodos();
	     if(nodo.esPadre()){
	         for(Nodo n:nodo.getHijos()){
	             numeroHijos=numeroHijos+nodo.getNumeroDescendientes(n);

	         }
	         return numeroHijos;
	     }else{
	         return 0;
	     }
	}

}
