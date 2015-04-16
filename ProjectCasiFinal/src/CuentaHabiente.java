import java.util.Date;


public class CuentaHabiente {

    private int cuenta, index;
    private String usuario;
    private double saldo;
    private Date fecha,hora;
    // cosntrucctores
    public CuentaHabiente() { }
    public CuentaHabiente(int c, double s, String u) {
        setCuenta(c);
        setUsuario(u);
        setFecha();
        setSaldo(s);
        setHora();//HORA
    }

    // metodos para ingresar datos
    void setCuenta(int c){ 
    	cuenta = c; }
    void setSaldo(double sald){ 
    	saldo = sald; }
    void setUsuario(String usua){ 
    	usuario = usua; }
    void setFecha(){ 
    	fecha =new Date(); }
    void setHora(){//HORA
    	hora = new Date(); }
    void setIndex(int i){ 
    	index = i; }
    // metodos para obtener datos

    int getCuenta(){ 
    	return cuenta; }
    double getSaldo(){ 
    	return saldo; }
    String getUsuario(){ 
    	return usuario; }
    Date getFecha(){ 
    	return fecha; }
    Date getHora(){ //HORA
    	return hora; }

    int getIndex(){ 
    	return index; }

    // funci�n que devuelve una cadena
    String ConvierteString(){
        String cadena = getCuenta() + ";" +
        				getSaldo() + ";" +
                        getUsuario() + ";" +
                        getFecha().getDay()+1+ "/" +
                        (getFecha().getMonth()+1)+ "/" +
                        (getFecha().getYear()+1900)+ ";" +
                        getFecha().getHours()+ ":" +
                        getFecha().getMinutes()+ ":" +
                        getFecha().getSeconds();
                        
        return cadena;
    }
}
