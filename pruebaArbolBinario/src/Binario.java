import java.util.Random;
import java.util.Scanner;//importamos la libreria


public class Binario {//clases arbol binario /*nodo del arbol*/
	int dato;//variable 
	Binario izq, der;//variables izquierda y derecha
	
	Binario (int Elem){//Constructor 
		dato = Elem;//igualamos a la variable dato con elemento 
		izq=der = null;//declaramos a la variable izquierda y derecha como nulos o vacios
	}
	
	//Insercion de un elemento
	public void Insertar (int Elem){//metodo insertar
		if(Elem < dato){//si el elemennto a insertar es menor a la raiz se insertar en el lado izquerdo
			if (izq == null)//si nodo esta vacio
				izq = new Binario(Elem);//solo contendra un solo nodo que es la raiz
			else
				izq.Insertar(Elem);//si no se inserta un elemento en el lado derecho
		}
		else{//opcional
			if (Elem > dato){//si el elemento a insertar es mayor que el elemento raiz se inserta en el lado derecho
				if (der == null)//si nodo esta vacio
					der = new Binario (Elem);//solo contendra un solo nodo que es la raiz
				else
					der.Insertar(Elem);//si no se inserta un elemento en el lado izquierdo
			}
		}//opcional
	}//fin metodo insertar
}//fin metodo binario

//Definicion de la clase Arbol
class Arbol{//inicio clase arbol
	Cola Cola = new Cola();//creamos una instancia de la clase cola con el nombre cola
	Binario Padre;//creamos variables
	Binario Raiz;
	
	//Constructor
	public Arbol(){
		Raiz = null;
	}
	
	//Insercion de un elemento en el arbol
	public void InsertaNodo(int Elem){
		if(Raiz == null)
			Raiz = new Binario (Elem);
		else
			Raiz.Insertar (Elem);
	}
	
	//Preorden Recursivo del arbol
	public void Preorden (Binario Nodo){
		if(Nodo == null)//si es nulo procesa el elemento raiz
			return;
		else{//if(Nodo!=null)
			System.out.print (Nodo.dato + " ");//se procesa la raiz antes de recorrer la rama
			Preorden (Nodo.izq);//recorre hacia la izquierda
			Preorden (Nodo.der);//recorre hacia la derecha
		}
	}
	
	//PostOrden recursivo del arbol
	public void PostOrden (Binario Nodo){
		if(Nodo == null)//si es nulo 
			return;
		else{//en caso de no ser nulo if(Nodo!=null)
			PostOrden (Nodo.izq);//realiza el recorrido hacia la izquierda
			PostOrden (Nodo.der);//despues hacia la derecha
			System.out.print (Nodo.dato + " ");//despues procesa el valor del nodo
		}
	}
	
	//Inorden Recursivo del arbol
	public void Inorden (Binario Nodo){	
		if(Nodo == null)//si es nulo
			return;
		else{//en caso de no ser if(Nodo!=null)
			Inorden (Nodo.izq);//realiza el recorrido hacia la izquierda
			System.out.print(Nodo.dato + " ");//despues de recorrer procesa el nodo raiz 
			Inorden (Nodo.der);//despues realiza el recorrido hacia la derecha
		}
	}
	
	//Busca un elemento en el arbol
	void Busqueda (int Elem, Binario A){//comparar el elemto con la raiz
		if((A == null) | (A.dato == Elem)){////si es arbol es nulo el elemento no esta//pero si se trata del elemento raiz ya se ha encontrado
			System.out.print(A.dato + " ");//y se procesa la raiz jeje eso creo
			return;
		}
		else{//dependiendo si sea mayor o menor ir al subarbol derecho o izquierdo
			if(Elem>A.dato)//si es mayor se busca en el subarbol derecho
				Busqueda (Elem, A.der);//Si el elemento es menor que la raíz hay que hacer la búsqueda en el subárbol izquierdo(llamada recursiva).
			else//si es menor se busca en el subarbol izquierdo
				Busqueda ( Elem, A.izq);//Si el elemento es mayor, hay que hacer la búsqueda en el subárbol derecho (llamada recursiva).
		}//si el elemento esta en el arbol sera la direcion del nododonde se encuentra el elemento
	}//si el elemento no esta en el nodo devolvera un puntero nulo
	
	//Altura del arbol
	public int Altura (Binario Nodo){
		//tambien Binario k=nodo;
		int Altder = (Nodo.der == null? 0:1 + Altura (Nodo.der));//int altizq=nodo.izq==null?1:1+altura(nodo.izq);
		int Altizq = (Nodo.izq == null? 0:1 + Altura (Nodo.izq));//int altder=nodo.der==null?1:1+altura(nodo.der);
		return Math.max(Altder,Altizq);	
	}
	
	//Recorrido en anchura del arbol
	public void Anchura (Binario Nodo){
		Cola cola= new Cola();//una cola para almacenar los arboles(nodos)
		Binario T = null;
		System.out.print ("El recorrido en Anchura es: ");
		if(Nodo != null){//extraemos los elementos de la cola y por cada elemento que se extrea que no sea vacio
			cola.InsertaFinal (Nodo);
			while(!(cola.VaciaLista ())){
				T = cola.PrimerNodo.datos;
				cola.EliminaInicio();
				System.out.print(T.dato + " ");
				if (T.izq != null)//realiza la busqueda en la izquierda
					cola.InsertaFinal (T.izq);
				if (T.der != null)//realiza la busqueda en la derecha
					cola.InsertaFinal (T.der);
			}
		}//el proceso termina cuando esta vacia
		System.out.println();
	}//consiste en encolar en la cola los punters de las direcciones o referencias los posibles hijos de cada nodo procesado la direccin se localiza en la variable t
}

//Definición de la Clase NodoLista
class NodosListaA{
  	Binario datos;
    NodosListaA siguiente;

     //Construtor  Crea un nodo del tipo Object
	NodosListaA (Binario  valor){
		datos =valor;
	    siguiente = null;  //siguiente con valor de nulo
	 }

	// Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
	NodosListaA (Binario valor, NodosListaA signodo){ 
		datos = valor;
    	siguiente = signodo; //siguiente se refiere al siguiente nodo
	}
}

//Definición de la Clase Lista
class Cola{
	NodosListaA PrimerNodo;
	NodosListaA UltimoNodo;
	String Nombre;
	
	//Constructor construye una lista vacia con un nombre de List
	public Cola(){ 
		this ("Lista");
	}

	//Constructor
 	public Cola (String s){
		Nombre = s;
	    PrimerNodo = UltimoNodo =null;
	}
	
	//Retorna True si Lista Vacía
	public boolean VaciaLista() {
		return PrimerNodo == null;
	}
	
	//Inserta un Elemento al Frente de la Lista
	public void InsertaInicio (Binario ElemInser){
		if(VaciaLista())
	    	PrimerNodo = UltimoNodo = new NodosListaA (ElemInser);
	    else
	    	PrimerNodo = new NodosListaA (ElemInser, PrimerNodo);
	}
	
	//Inserta al Final de la Lista
	public void InsertaFinal(Binario ElemInser){
		if(VaciaLista())
	        PrimerNodo = UltimoNodo = new NodosListaA (ElemInser);
	    else
	  	     UltimoNodo=UltimoNodo.siguiente =new NodosListaA (ElemInser);
	}
	
	//Eliminar al Inicio
	public void EliminaInicio(){
		if(VaciaLista()) //si el arbol es nulo el elmento no existe
	    	System.out.println ("No hay elementos");
	       
	 	// Restablecer  las referencias de PrimerNodo y UltimoNodo
	 	if(PrimerNodo.equals (UltimoNodo))
	    	PrimerNodo = UltimoNodo = null;
	    else
	    	PrimerNodo = PrimerNodo.siguiente;
	}
	
	//Elimina al final
	public void EliminaFinal (){
	    if(VaciaLista())
	      System.out.println ("No hay elementos");
	    
		// Restablecer  las referencias de PrimerNodo y UltimoNodo
		if (PrimerNodo.equals (UltimoNodo))
	    	PrimerNodo = UltimoNodo = null;
	    else{
	    	NodosListaA Actual =PrimerNodo;
			while (Actual.siguiente != UltimoNodo)
				Actual = Actual.siguiente;
			
			UltimoNodo =Actual;
			Actual.siguiente = null;
	    }
	}
}
class ArbolBinarioA{
	public static void main (String[]args){
		Random elemento=new Random();
		Scanner datos=new Scanner(System.in);
		Arbol A = new Arbol();
		for(int i=0;i<10;i++ ){
			//System.out.println("Inserta Elemento: "+(i+1));
			//A.InsertaNodo(datos.nextInt());
			A.InsertaNodo(elemento.nextInt(100));
		}
		System.out.print("El recorrido en Preorden es: ");
		A.Preorden (A.Raiz);
		System.out.println();
		System.out.print("El recorrido en Inorden es: ");
		A.Inorden (A.Raiz);
		System.out.println();
		System.out.print("El recorrido en Postorden es: ");
		A.PostOrden (A.Raiz);
		System.out.println();
		System.out.println("La altura del arbol es: " + A.Altura (A.Raiz));
		A.Anchura(A.Raiz);
		datos.close();
	}

}
