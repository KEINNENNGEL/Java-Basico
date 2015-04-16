package Pila;

public class TestPila {
	public static void main(String[]args){

		Pila2 valor=new Pila2();
		valor.esVacia();
		valor.apilar(10);
		valor.apilar(6);
		valor.apilar(0);
		valor.apilar(9);
		valor.apilar(3);
		valor.apilar(78);
		valor.desapilar();
		valor.tamanio();
		valor.cima();
		valor.mostrar();
		valor.vaciar(valor);
		valor.mostrar();
	}

}
