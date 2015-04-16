package Cajero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.csvreader.CsvReader;

public class LeerRegistro {
	public static void main(String[] args) throws IOException{
		CsvReader reader = null;
		String axx="1";
		try {// Le pasamos la URL del archivo CSV a leer.
			reader = new CsvReader("C:/ArchivosCSV/Productos.csv");
			while (reader.readRecord()) {
				// reader.get(Integer) - devuelve el contenido del numero de columna que le pasamos
				//String id = reader.get(0);
				//String producto = reader.get(1);
				//String stock = reader.get(2);
				//String precio = reader.get(3);
				//System.out.println("Filas: " + id + "-" + producto + "-"+ stock + "-" + precio);
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		reader.close();
		//
		 BufferedReader CSVFile = 
			        new BufferedReader(new FileReader("C:/ArchivosCSV/Productos.csv"));

			  String dataRow = CSVFile.readLine(); // Read first line.
			  // The while checks to see if the data is null. If 
			  // it is, we've hit the end of the file. If not, 
			  // process the data.
			  String aux[]=new String[6];
			  
			  while (dataRow != null){
				  int i=0;
				  String[] dataArray = dataRow.split(",");
				  for (String item:dataArray) {
					  if(dataRow.startsWith(axx)){
						  System.out.print(item + "\t");
						  aux[i]=item;
			    	  
					  }i++;
				  }
			   System.out.println(); // Print the data line.
			   dataRow = CSVFile.readLine(); // Read next line of data.
			  }
			  System.out.println("*********************************************************");
			  System.out.println("**********************CLIENTE****************************");
			  System.out.println("*********************************************************");
			  System.out.println("---------------------------------------------------------");
			  System.out.println("|CL	|	Usuario	|	Fecha	|	Hora"+"	|" );
			  System.out.println("|-------------------------------------------------------|");
			  System.out.println( "|"+aux[0]+"	|	"+aux[1]+"	|	"+aux[2]+"|	"+aux[3]+"	|");
			  System.out.println("---------------------------------------------------------");
			  // Close the file once all data has been read.
			  CSVFile.close();

			  // End the printout with a blank line.
			  System.out.println();
	}

}
