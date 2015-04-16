

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.csvreader.CsvReader;
public class LeerRegistro {

	public String Mensajeee(String CL) throws IOException{
		CsvReader reader = null;
		 BufferedReader CSVFile = 
			        new BufferedReader(new FileReader("C:/ArchivosCSV/Productos.csv"));

			  String dataRow = CSVFile.readLine(); // Leyendo la primera linea
			  // Verificamos que la linea sea diferente a nulo. Si
			  // Lo es , Finalizamos el archivo. Si no, 
			  // procesamos la informacion
			  String aux[]=new String[6];
			  
			  while (dataRow != null){
				  int i=0;
				  String[] dataArray = dataRow.split(",");
				  for (String item:dataArray) {
					  if(dataRow.startsWith(CL)){
						  //System.out.print(item + "\t");
						  aux[i]=item;//alamacenando la informacion obtenida
			    	  
					  }i++;
				  }
			   System.out.println(); // Imprimiendo una linea en blanco
			   dataRow = CSVFile.readLine(); // Leyendo la informacion siguiente de linea
			  }
			  String a="*********************************************************\n";
			  String b="|			CLIENTE				|\n";
			  String c="*********************************************************\n";
			  String d="---------------------------------------------------------\n";
			  String e="|CL	|	Usuario	|	Fecha	|	Hora"+"	|\n" ;
			  String f="|-------------------------------------------------------|\n";
			  String g= "|"+aux[0]+"	|	"+aux[1]+"	|	"+aux[2]+"|	"+aux[3]+"	|\n";
			  String h="---------------------------------------------------------\n";
			  // Cerrando el archivo una vez que fueron leidos los datos
			  CSVFile.close();
			  CL=a+b+c+d+e+f+g+h;
			  // Imprimiendo una linea en blanco
			  System.out.println();
			  return CL;
	}
}
