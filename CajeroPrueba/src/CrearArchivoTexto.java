import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import com.csvreader.CsvWriter;
import com.csvreader.CsvWriter;
import java.io.IOException;
public class CrearArchivoTexto {
	private Formatter salida; // objeto usado para enviar texto al archivo 
	// permite al usuario abrir el archivo
	public void abrirArchivo(){
		try{
			salida = new Formatter( "Usuarios.txt" );
			//CsvWriter writer=new CsvWriter("Usuarios.csv");
			
			} // ﬁn de try 
		catch ( SecurityException securityException ) {
			System.err.println("No tiene acceso de escritura a este archivo." );
			System.exit( 1 );
			} // ﬁn de catch
		catch ( FileNotFoundException ﬁlesNotFoundException ){
			System.err.println( "Error al crear el archivo." );
			System.exit( 1 );
			} // ﬁn de catch
		} // ﬁn del método abrirArchivo
	// agrega registros al archivo
	public void agregarRegistros() throws IOException{
		//CsvWriter writer=new CsvWriter("Usuarios.csv");
		//CsvWriter wri=new CsvWriter();
		// objeto que se va a escribir en el archivo
		RegistroCuenta registro = new RegistroCuenta();
		Scanner entrada = new Scanner( System.in );
		System.out.println("En Windows escriba <ctrl> z y oprima Intro" );
		System.out.printf( "%s\n%s","Cuenta, Saldo, Usuario", "Fecha" );
		System.out.println( "Cuenta	Saldo	Usuario	Fecha	Hora" );
		while ( entrada.hasNext() ) // itera hasta encontrar el indicador de ﬁn de archivo 
			{
			try // envía valores al archivo
			{// obtiene los datos que se van a enviar
				registro.establecerCuenta(entrada.nextInt());
				registro.establecerSaldo(entrada.nextDouble());
				registro.establecerUsuario(entrada.next());
				registro.establecerFecha(entrada.next());
				registro.establecerHora(entrada.next());
				if ( registro.obtenerCuenta() > 0 ){// escribe el nuevo registro
					salida.format(registro.obtenerCuenta()+registro.obtenerSaldo()+registro.obtenerUsuario()+
							registro.obtenerFecha()+registro.obtenerHora());
					} // ﬁn de if
				else{
					System.out.println("El numero de cuenta debe ser mayor que 0." );
					} // ﬁn de else 
				}catch ( FormatterClosedException formatterClosedException ){
					System.err.println( "Error al escribir en el archivo." );
					return;
					} // ﬁn de catch
			catch ( NoSuchElementException elementException )
			{
				System.err.println( "Entrada invalida. Intente de nuevo." );
				entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
				} // ﬁn de catch 87 88    
			System.out.printf( "%s %s\n%s", "Escriba el numero de cuenta (> 0),",
					"primer nombre, apellido paterno y saldo.", "? " );
			} // ﬁn de while
		} // ﬁn del método agregarRegistros
	// cierra el ﬁle
	public void cerrarArchivo(){
		if ( salida != null ){
			salida.close();
			} // ﬁn del método cerrarArchivo 
			}

	

}
