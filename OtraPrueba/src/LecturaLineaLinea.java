import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class LecturaLineaLinea {
	
	public static void main(String[]args){
	String nombreFichero = "prueba.txt";
	//Declarar una variable BufferedReader
	BufferedReader br = null;
	try {
	//Crear un objeto BufferedReader al que se le pasa
	//   un objeto FileReader con el nombre del fichero
	br = new BufferedReader(new FileReader(nombreFichero));
	//Leer la primera línea, guardando en un String
	String texto = br.readLine();
	//Repetir mientras no se llegue al final del fichero
	while(texto != null)
	{
	//Hacer lo que sea con la línea leída
	System.out.println(texto);
	//Leer la siguiente línea
	texto = br.readLine();
	}
	}
	catch (FileNotFoundException e) {
	System.out.println("Error: Fichero no encontrado");
	System.out.println(e.getMessage());
	}
	catch(Exception e) {
	System.out.println("Error de lectura del fichero");
	System.out.println(e.getMessage());
	}
	finally {
	try {
	if(br != null)
	br.close();
	}
	catch (Exception e) {
	System.out.println("Error al cerrar el fichero");
	System.out.println(e.getMessage());
	}
	}
	LecturaLineaLinea x=new LecturaLineaLinea();
	x.escribir();
	x.buscaPalabras();
	}

	public void escribir(){
		String nombreFichero = "prueba.txt";
		String texto = "Texto de prueba";
		BufferedWriter bw = null;
		try {
		//Crear un objeto BufferedWriter. Si ya existe el fichero,
		//se borra automáticamente su contenido anterior.
		bw = new BufferedWriter(new FileWriter(nombreFichero));
		//Escrbir en el fichero el texto con un salto de línea
		bw.write(texto + "\n");
		}
		catch(Exception e) {
		System.out.println("Error de escritura del fichero");
		System.out.println(e.getMessage());
		}
		finally {
		try {
		//Cerrar el buffer
		if(bw != null)
		bw.close();
		}
		catch (Exception e) {
		System.out.println("Error al cerrar el fichero");
		System.out.println(e.getMessage());
		}
		}
	}
public void buscaPalabras(){
	File archivo = null;
	try {
	archivo = new File("prueba.txt");//"archivo.txt" es el archivo que va a leer
	String linea;
	FileReader fr = new FileReader (archivo);
	BufferedReader br = new BufferedReader(fr);
	int i,j,aux=0;
	while((linea=br.readLine())!=null) {
	for(i=0;i<linea.length();i++)
	{
	  if(linea.charAt(i)=='a')
	  {
	     if(i==0) 
	      aux=1;
	      else
	      {if(linea.charAt(i-1)==' ')
	        aux=1;
	      }
	  }
	 if(aux==1)
	  {if(linea.charAt(i)!=' ')
	      System.out.print(linea.charAt(i));
	   else 
	   {aux=0; System.out.println(' ');}
	  }
	 }
	 }
	fr.close();
	 }
	catch(IOException a){
	System.out.println(a);
	  }
	 }

}
