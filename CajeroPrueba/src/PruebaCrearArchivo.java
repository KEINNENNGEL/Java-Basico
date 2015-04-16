
public class PruebaCrearArchivo {
	public static void main( String args[] ){
		CrearArchivoTexto a= new CrearArchivoTexto();
		a.abrirArchivo();
		try{
			a.agregarRegistros();
		}catch(Exception x){
		}
		a.cerrarArchivo();
		
		//LeerDatosUsuario o=new LeerDatosUsuario();
		//o.abrirArchivo();
		//o.LeerRegistro();
		//o.cerrarArchivo();
} 
}
