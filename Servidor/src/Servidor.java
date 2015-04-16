import java.net.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.io.*;
public class Servidor {
	
	ServerSocket server;
	Socket socket;
	int puerto=9000;
	DataOutputStream salida;
	BufferedReader entrada;
	ArrayList listaNumeros = new ArrayList();//declaracion 
	int arreglox[]=new int[50];
	public void iniciar(){
		//int numeros[]=new int [50];
		Servidor s=new Servidor();
		try{
			server =new ServerSocket(puerto);
			socket =new Socket();
			socket = server.accept();
			
			entrada =new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			String mensaje =entrada.readLine();
			char elementos[]=mensaje.toCharArray();
			for(int i=0;i<elementos.length;i++){
				if(Character.isLetter(elementos[i])){
				}else{
					//arreglox[elementos[i]]=i;
					listaNumeros.add(elementos[i]);
					}
			}Servidor o=new Servidor();
			System.out.println(listaNumeros);
			
			for(int i=0;i<arreglox.length;i++){
			System.out.println(arreglox[i]);
			}
			//o.burbujaw(listaNumeros);
		    //for(int x=0;x<elementos.length;x++){
			   //int arreglox[]=(int) listaNumeros;
			   //System.out.println(arreglox[x]);
			  //  }

			for(int i=0;i<elementos.length;i++){
				if(Character.isLetter('B')){
					o.burbuja(arreglox);
				}
				if(Character.isLetter('I')){
					o.Insercion(arreglox);
				}
			}
			salida =new DataOutputStream(socket.getOutputStream());
			salida.writeUTF("	"+listaNumeros);
			
			socket.close();
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	public int[] burbuja(int[]arreglo){  
        int aux;
        for(int iterador=1;iterador < arreglo.length;iterador++){  
            for (int j=0 ; j < arreglo.length- 1; j++){  
                if (arreglo[j] > arreglo[j+1]){  
                    aux = arreglo[j];  
                    arreglo[j] = arreglo[j+1];  
                    arreglo[j+1] = aux;  
                }
            }
        }
        //System.out.println(arreglo);
        return arreglo;
    }
	public int[] Insercion (int[] vector) { 
		
	      for (int i=1; i < vector.length; i++) {  
	         int aux = vector[i];  
	         int j;  
	         for (j=i-1; j >=0 && vector[j] > aux; j--){  
	              vector[j+1] = vector[j];  
	          }  
	         vector[j+1] = aux;  
	      }
	      return vector;
	   }
	public static void main(String []args){
		Servidor o=new Servidor();
		o.iniciar();
	}
}


