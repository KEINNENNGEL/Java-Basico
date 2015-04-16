package PilaRedimencioando;

public class TestPila {
	public static void main(String[]args){
		
		Pila valores =new Pila(3);
		valores.esVacia();
		valores.apilar(7);
		valores.apilar(6);
		valores.cima();
		valores.mostrar();
		valores.apilar(9);
		valores.cima();
		valores.mostrar();
		valores.desapilar();
		valores.esVacia();
		valores.tamanio();
	}

}
