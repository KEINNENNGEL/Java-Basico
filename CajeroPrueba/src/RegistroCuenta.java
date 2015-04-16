
public class RegistroCuenta {
	private int cuenta;
	private String usuario;
	private String fecha;
	private double saldo;
	private String hora;
	// el constructor sin argumentos llama a otro constructor con valores predeterminados 
	public RegistroCuenta(){
		this( 0,  0.0 ,"", "",""); // llama al constructor con cuatro argumentos 
	} // ﬁn del constructor de RegistroCuenta sin argumentos
	// inicializa un registro 
	public RegistroCuenta( int CA, double sal , String usuario, String fecha,String hora){
		establecerCuenta( CA );
		establecerSaldo( sal );
		establecerUsuario( usuario );
		establecerFecha( fecha );
		establecerHora(hora);
		} // ﬁn del constructor de RegistroCuenta con cuatro argumentos
	// establece el número de cuenta
	public void establecerCuenta( int cta ){
		cuenta = cta;
		} // ﬁn del método establecerCuenta
	// obtiene el número de cuenta
	public int obtenerCuenta(){
		return cuenta;
		} // ﬁn del método obtenerCuenta
	// establece el primer nombre
	public void establecerSaldo( double sal ){
		saldo = sal;
		} // ﬁn del método establecerSaldo
	// obtiene el saldo
	public double obtenerSaldo(){
		return saldo;
		} // ﬁn del método obtenerSaldo 
	public void establecerUsuario( String nombre ){ 
		usuario= nombre;
		} // ﬁn del método establecerPrimerNombre
	// obtiene el primer nombre
	public String obtenerUsuario(){
		return usuario;
		} // ﬁn del método obtenerPrimerNombre
	// establece el apellido paterno
	public void establecerFecha( String fech ){
		fecha = fech;
		} // ﬁn del método establecerApellidoPaterno
	// obtiene el apellido paterno 
	public String obtenerFecha(){
		return fecha; 
		} // ﬁn del método obtenerApellidoPaterno 
	// establece el saldo
	public void establecerHora(Object x){
		hora=(String) x;
	}
	public String obtenerHora(){
		return hora;
		}
}
