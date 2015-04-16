import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {
	
	private ServerSocket servidor;
	private Socket conexion = null;
	private ObjectOutputStream salida;
	private ObjectInputStream entrada;
	private String mensaje;

	private void run(){
		try{
			//1. creando un socket de tipo servidor
			servidor = new ServerSocket(2004, 10);
			//2. Espera la conexion
			System.out.println("Esperando conexion del cliente");
			conexion = servidor.accept();
			System.out.println("Conexion recibida de " + conexion.getInetAddress().getHostName());
			//3. Obteniendo los canales de entrada y salida
			salida = new ObjectOutputStream(conexion.getOutputStream());
			salida.flush();
			entrada = new ObjectInputStream(conexion.getInputStream());
			enviarMensaje("Conexion permitida por el servidor");
			//4. Las dos partes que de comunicacion a canales de entrada-salida
			do{
				try{
					mensaje = (String) entrada.readObject();
					System.out.println("cliente: \n" + mensaje);
					if (mensaje.equals("bye"))
						enviarMensaje("bye");
				}
				catch(ClassNotFoundException classnot){
					System.err.println("Datos recibidos en formato desconocido");
				}
			}while(!mensaje.equals("bye"));
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Cerrando conexion
			try{
				entrada.close();
				salida.close();
				servidor.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	
	private void enviarMensaje(String mensaje){
		try{
			salida.writeObject(mensaje);
			salida.flush();
			System.out.println("servidor: \n" + mensaje);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		Servidor servidor = new Servidor();
		while(true){
			servidor.run();
		}
	}
}
