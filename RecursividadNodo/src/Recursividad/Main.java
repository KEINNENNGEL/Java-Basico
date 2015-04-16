package Recursividad;

public class Main {
	public static void main(String[]args){
		Nodo padre=new Nodo();
		Nodo hijo1=new Nodo();
		
		padre.addNodo(hijo1);
		
		hijo1.addNodo(new Nodo());
		hijo1.addNodo(new Nodo());
		hijo1.addNodo(new Nodo());
		
		System.out.println(padre.getNumeroDescendientes(padre));
	}

}
