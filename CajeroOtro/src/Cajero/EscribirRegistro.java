package Cajero;


import java.io.IOException;

import com.csvreader.CsvWriter;

public class EscribirRegistro {
	public static void main(String[] args) {
		// Le pasamos el nombre del archivo CSV a generar.
		CsvWriter writer = new CsvWriter("C:/ArchivosCSV/Productos.csv");

		try {
			// writer.write(String) - Escribe los campos separandolos con coma
			// automaticamente.
			writer.write("CL");
			writer.write("USUARIO");
			writer.write("FECHA");
			writer.write("HORA");			
			writer.endRecord();// writer.endRecord() - Termina con la linea.
			
			
			writer.write("1");
			writer.write("MIGUEL");
			writer.write("15-09-2012");
			writer.write("10:50");
			writer.endRecord();

			writer.write("2");
			writer.write("AARON");
			writer.write("12-12-12");
			writer.write("1:00");
			writer.endRecord();

			writer.write("3");
			writer.write("ISELA");
			writer.write("1-09-2013");
			writer.write("7:37");
			writer.endRecord();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}

}
