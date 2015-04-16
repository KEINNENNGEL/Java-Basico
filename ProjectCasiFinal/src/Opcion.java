import java.util.*;
public class Opcion {

    // variable para los datos de los clientes
    private String path = "clientes.txt";
    // bitacora para las transacciones
    private String bitacora = "bitacora.txt";

    void cargarAhorro(){
        // objeto para manejar los datos del cliente que necesitamos
        CuentaHabiente ch = new CuentaHabiente();
        // Objeto para lectura y escritura de archivos
        IO_Archivo io = new IO_Archivo();
        // objeto para la bitacora
        Bitacora bt = new Bitacora();
        // objeto que maneja las capturasd del teclado
        CapturaTeclado ct = new CapturaTeclado();
        // variable para el numero de cuenta
        int c = 0;
        // Variable para el saldo anterior y el actual
        double san = 0, sac = 0, deposito = 0;
        //Opcion aux=new Opcion();
        System.out.println("");

        do { 
        	System.out.println("Ingresa el n�mero de cuenta:");
            
            
        } while ((c = ct.CapturaInt())== 0);
        	
        if (io.LeerCH(path, ch, c)) {
            System.out.println("+---------------------------------------------------------------------------------------------------------------+");
            System.out.println("|	Cuenta	|	Usuario	|	Saldo	|	Fecha	|	Hora	|	Index	|");
            System.out.println("|---------------------------------------------------------------------------------------------------------------|");
            System.out.println("| "+ch.getCuenta()+" 	| "+ ch.getUsuario()+" 	| "+ ch.getSaldo()+" 	| " +ch.getFecha()+" 	| "+ ch.getHora()+"	|" +ch.getIndex()+"|");
            System.out.println("+---------------------------------------------------------------------------------------------------------------+");
            
            System.out.println("\nIngresa la suma a depositar:");
            // guardamos el saldo anterior
            san = ch.getSaldo();

            if ((deposito = ct.CapturaDouble()) > 0) {
                // sacamos el total del saldo actual
                sac = ch.getSaldo() + deposito;
                // ingresamos el nuevo saldo
                ch.setSaldo(sac);
                // creamos el objeto bitacora
                bt.setCuenta(ch.getCuenta());
                bt.setFecha();
                bt.setSaldoAnt(san);
                bt.setSaldoAct(sac);
                String lnBitacora = bt.ConvierteString();
                io.EscribirBT(bitacora, lnBitacora);
                io.EscribirCH(path, ch.ConvierteString(), ch.getIndex());
            } else {
                System.out.println("Ingresa una cantidad v�lida!!!");
            }
            //aux.Salir(c);
        }

    }
    void retirar(){
        // objeto para manejar los datos del cliente que necesitamos
        CuentaHabiente ch = new CuentaHabiente();
        // objeto para lectura y escritura de archivos
        IO_Archivo io = new IO_Archivo();
        // objeto para la bitacora
        Bitacora bt = new Bitacora();
        // objeto que maneja las capturasd del teclado
        CapturaTeclado ct = new CapturaTeclado();
        // variable para el numero de cuenta
        int c = 0;
        // Variable para el saldo anterior y el actual
        double san = 0, sac = 0, retiro = 0;

        System.out.println("");

        do { System.out.println("Ingresa el n�mero de cuenta:");
        } while ((c = ct.CapturaInt())== 0);

        if (io.LeerCH(path, ch, c)) {
            System.out.println("Index......: " + ch.getIndex());
            System.out.println("Cuenta.....: " + ch.getCuenta());
            System.out.println("Nombre.....: " + ch.getUsuario());
            System.out.println("Direcci�n..: " + ch.getFecha());
            System.out.println("Tel�fono...: " + ch.getHora());
            System.out.println("Saldo......: " + ch.getSaldo());

            System.out.println("\nIngresa la suma a debitar:");
            // guardamos el saldo anterior
            san = ch.getSaldo();

            if ((retiro = ct.CapturaDouble()) < san) {
                if (retiro > 0) {
                    // sacamos el total del saldo actual
                    sac = ch.getSaldo() - retiro;
                    // ingresamos el nuevo saldo
                    ch.setSaldo(sac);
                    // creamos el objeto bitacora
                    bt.setCuenta(ch.getCuenta());
                    bt.setFecha();
                    bt.setSaldoAnt(san);
                    bt.setSaldoAct(sac);
                    String lnBitacora = bt.ConvierteString();
                    io.EscribirBT(bitacora, lnBitacora);
                    String ln = ch.ConvierteString();
                    if (retiro < 10) { ln = ln.concat("0"); }
                    else if (retiro < 100) { ln = ln.concat("00"); }
                    else if (retiro < 1000) { ln = ln.concat("000"); }
                    else if (retiro < 10000) { ln = ln.concat("0000"); }
                    io.EscribirCH(path, ln, ch.getIndex());
                } else {
                    System.out.println("El monto debe ser mayor de cero!!!");
                }
            } else {
                System.out.println("No tines suficiente saldo!!!");
            }
        }
    }

    void verAhorro(){
        // lista para manejar los datos obtenidos del archivo
        LinkedList<String> l = new LinkedList<String>();
        // objeto que leera el archivo
        IO_Archivo io = new IO_Archivo();
        // variables para manejar los indices
        int ind1 = 0, ind2 = 0;

        io.LeerBT(bitacora, l);
        System.out.println("+----------------------------------------------------------------+");
        System.out.println("|Cuenta No.\t|dd/mm/aa hh:mm:ss\t|S Anterior\t|S Acutal|");
        System.out.println("+----------------------------------------------------------------+");

        for (int i = 0; i < l.size(); i++) {
        	System.out.println("+................................................................+");
            // capturamos el numero de cuenta
            ind2 = l.get(i).indexOf(";");
            System.out.print("|"+l.get(i).substring(0, ind2) + "\t|");
            // La fecha y hora
            ind1 = ind2 + 1;
            ind2 = l.get(i).indexOf(";", ind1);
            System.out.print(l.get(i).substring(ind1, ind2) + "\t|");
            // Saldo anterior
            ind1 = ind2 + 1;
            ind2 = l.get(i).indexOf(";", ind1);
            System.out.print(l.get(i).substring(ind1, ind2) + "\t|");
            // Saldo actual
            ind1 = ind2 + 1;
            System.out.println(l.get(i).substring(ind1)+"");
            System.out.println("+................................................................+");
            System.out.println("");
        }
    }
    void salir(){
    	// variable para el numero de cuenta
        int c = 0;
        
    	// objeto para manejar los datos del cliente que necesitamos
        CuentaHabiente ch = new CuentaHabiente();
        // Objeto para lectura y escritura de archivos
        IO_Archivo io = new IO_Archivo();
        // objeto para la bitacora
        Bitacora bt = new Bitacora();
        // objeto que maneja las capturasd del teclado
        CapturaTeclado ct = new CapturaTeclado();
        
        System.out.println("");

        do { System.out.println("Ingresa el n�mero de cuenta:");
        	//c=aux;
        } while ((c = ct.CapturaInt())== 0);
        //c=aux;
        if (io.LeerCH(path, ch, c)) {
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|	  CL	 	|	USUARIO		|		FECHA		       |		HORA		|");
            System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|	"+ch.getCuenta()+"	|	"+ch.getUsuario()+"	|	"+ch.getFecha()+"   |  "+     ch.getHora()+"	|");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
            //System.out.println("Index......: " + ch.getIndex());
        }
    }
}
