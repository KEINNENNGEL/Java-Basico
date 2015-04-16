import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
public class LeerDatosUsuario {
	private Scanner entrada;
	
	public void abrirArchivo(){
		try{
		entrada=new Scanner(new File("Usuarios.csv"));
		}
		catch(FileNotFoundException fileNotFoundException){
			System.err.println("Error al abrir el archivo");
			System.out.println(1);
		}
	}
	public void LeerRegistro(){
		RegistroCuenta registro=new RegistroCuenta();
		
		System.out.printf("%-9s%-15s%-18s%10s\n", "CL", "Usuario", "Fecha", "Hora" );
		try{
			while(entrada.hasNext()){
				 registro.establecerCuenta( entrada.nextInt() ); // lee el número de cuenta 43          
				 registro.establecerSaldo( entrada.nextDouble()); // lee el primer nombre 44          
				 registro.establecerUsuario( entrada.next() ); // lee el apellido         paterno 45          
				 registro.establecerFecha( entrada.next() ); // lee el saldo 46 47          // muestra el contenido del registro 48 
				 registro.establecerHora(entrada.next());
				 System.out.printf( registro.obtenerCuenta()+registro.obtenerSaldo()+
						 registro.obtenerUsuario()+ registro.obtenerFecha()+registro.obtenerHora());
				 } 
		}
		catch ( NoSuchElementException elementException ){
			System.err.println( "El archivo no esta bien formado." );
			entrada.close();
			System.exit( 1 );
			} // ﬁn de catch 59   
		catch ( IllegalStateException stateException ){
			System.err.println( "Error al leer del archivo." );
			System.exit( 1 );
			} // ﬁn de catch
		} // ﬁn del método leerRegistros
	// cierra el archivo y termina la aplicación
	public void cerrarArchivo(){
		if ( entrada != null )
			entrada.close(); // cierra el archivo 71 } // ﬁn del método cerrarArchivo 
		}
}
