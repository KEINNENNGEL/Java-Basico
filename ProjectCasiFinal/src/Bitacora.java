import java.util.Date;


public class Bitacora {
	private int cuenta;
    private Date fecha;
    private double saldoAnt, saldoAct;

    public Bitacora() { }

    public Bitacora(int c, double sAnt, double sAct) {
        cuenta = c;
        setFecha();
        saldoAnt = sAnt;
        saldoAct = sAct;
    }

    void setCuenta(int c){ cuenta = c; }
    void setFecha(){ fecha = new Date(); }
    void setSaldoAnt(double sAn){ saldoAnt = sAn; }
    void setSaldoAct(double sAc){ saldoAct = sAc; }

    int getCuenta(){ return cuenta; }
    Date getFecha(){ return fecha; }
    double getSaldoAnt(){ return saldoAnt; }
    double getSaldoAct(){ return saldoAct; }

    // devuelve una candena con todos los datos
    String ConvierteString(){
        String cadena;
        cadena =    getCuenta() + ";" +
                    getFecha().getDay() + "/" +
                    (getFecha().getMonth()+1)+ "/" +
                    (getFecha().getYear()+1900)+ " " +
                    getFecha().getHours()+ ":" +
                    getFecha().getMinutes()+ ":" +
                    getFecha().getSeconds()+ ";" +
                    getSaldoAnt()+ ";" +
                    getSaldoAct();
        return cadena;
    }
}
