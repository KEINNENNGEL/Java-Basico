package Separador;
import java.util.ArrayList;
public class Examen1 {//clase examen1 
	
	ArrayList listaLetras = new ArrayList();//declaracion de arraylist para guradar las letras
	ArrayList listaNumeros = new ArrayList();//declaracion de arraylist para guardar los numeros
	int indice;
	
	public String separar(String cadena){//metodo separar que recibe un parametro de tipo cadena
		
		char elementos[]=cadena.toCharArray();//declaramos un arreglo llamado elementos que convertira la cadena en char
		
		for(indice=0;indice<cadena.length();indice++){//recorremos el arreglo
			if(Character.isLetter(elementos[indice])){//comprobamos que la posicion actual sea una letra
				
				listaLetras.add(elementos[indice]);//agregamos la letra a la lista
			}else{
				
				listaNumeros.add(elementos[indice]);//agregamos los numeros a lista
			}
		}
		//System.out.println(listaLetras);//imprimimos las letras 
		//System.out.println(listaNumeros);//imprimimos los numeros
		
		return cadena;
	}
	public void imprimir(){
		System.out.println(listaLetras);//imprimimos las letras 
		System.out.println(listaNumeros);//imprimimos los numeros
	}
	public static void main(String []args){//metodo principal
		Examen1 nuevo=new Examen1 ();
		System.out.println(nuevo.separar("m16u3l4n63l1k4JUL1O153L444R0NN4Y3L1"));//agregamos un valor a la cadena que recibe en el metodo separar
		nuevo.imprimir();
	}
}

