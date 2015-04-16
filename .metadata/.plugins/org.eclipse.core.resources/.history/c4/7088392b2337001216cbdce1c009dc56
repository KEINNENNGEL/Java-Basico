import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	private Socket socketCliente;
	private ObjectOutputStream salida;
	private ObjectInputStream entrada;
	private String mensaje;
	
	void run(){
		try{
			//1. creando un soket de conexion al servidor
			socketCliente = new Socket("localhost", 2004);
			System.out.println("Conectado al servidor en el puerto 2004");
			//2. obteniendo los canales de entrada  salida
			salida = new ObjectOutputStream(socketCliente.getOutputStream());
			salida.flush();
			entrada = new ObjectInputStream(socketCliente.getInputStream());
			//3: Comunicandose con el servidor
			do{
				try{
					mensaje = (String) entrada.readObject();
					System.out.println("servidor: \n" + mensaje);
					enviarMensaje("Hola servidor..");
					
					LeerRegistro o=new LeerRegistro();//instanciamos la clase leerregistro
					mensaje=o.Mensajeee("2");//agregamos la variable que nos pide el metodo 
					//y a la vez almacenamos la informacion que nos esta retornando el metodo y la almacenamos en la variable
					//mensaje
					enviarMensaje(mensaje);//enviamos el msj 
					
					mensaje = "bye";
					enviarMensaje(mensaje);
					System.exit(0);
				}
				catch(ClassNotFoundException classNot){
					System.err.println("Datos recibidos en formato desconocido");
				}
			}while(!mensaje.equals("bye"));
		}
		catch(UnknownHostException unknownHost){
			System.err.println("Servidor desconocido!");
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Cerrando conexion
			try{
				entrada.close();
				salida.close();
				socketCliente.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	void enviarMensaje(String mensaje)
	{
		try{
			salida.writeObject(mensaje);
			salida.flush();
			System.out.println("cliente: \n" + mensaje);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}

	public static void main(String args[])
	{
		Cliente cliente = new Cliente();
		cliente.run();
	}
}
