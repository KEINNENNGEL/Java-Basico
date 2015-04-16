import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.*;
import java.util.LinkedList;

public class IO_Archivo {

    // funci�n para leer archivo, devuelve true s i lo lee o false si no
    // path - para la ruta
    // ll - lista para las lineas leidas
    // ch - para guardar los datos del cuenta habietne
    // c el numero de cuenta ingresado
    boolean LeerCH(String path, CuentaHabiente ch, int c){

        File fl = null;                 // objeto tipo file
        RandomAccessFile raf = null;    // objeto para lectura y escritura aleatoria

        String ln;                      // string para capturar lectura
        LinkedList<String> ll = new LinkedList<String>();
        boolean leido = true;           // variable para retornar

        try {
            // inicializamos los objetos para lectura de archivo
            fl = new File(path);
            raf = new RandomAccessFile(fl, "r");

            // iniciamos el ciclo de lectura y lo enviamos a la lista
            while ((ln = raf.readLine()) != null) { ll.add(ln); }
        } catch (Exception e) {
            // en caso de un error muostramos el mensaje y retornamos false
            System.out.println("No se ha encontrado el archivo!!!");
            leido = false;
        } finally {
            try {
                // cerramos el archivo abierto
                if (raf != null) { raf.close(); }
            } catch (Exception e) {
                // si hay error informamos al usuario
                System.out.println("Error al cerrar el archivo!!!");
            }
        }

        if (leido) {
            // verificamos el resultado
            if (Convertir(ll, ch, c) == ll.size()) {
                System.out.println("No se ha encontrado la cuenta!!!");
                leido = false;
            }
        }
        return leido;
    }

    // Funcion que recorre la lista en busca de coincidencias
    // l - la lista a recorres
    // ch - el objeto de cuenta habiente
    // c - en numero de cuenta ingresado
    int Convertir(LinkedList<String> l, CuentaHabiente ch, int c){
        // variable contador
        int i = 0;
        // para capturar la linea
        String ln;
        // ciclo para recorrer la lista
        while (i < l.size()) {
            // capturamos la linea
            ln = l.get(i);
            // verificamos el resultado
            if (Verificador(ln, c)) {
                // es el que buscamos lo combertimos el objeto cuenta habiente
                ConvierteObjeto(ln, ch, i);
                // teminamos el ciclo
                break;
            }
            // no es el que buscamos, aumentamos el contador
            i++;
        }
        // retornamos el contador para saber la posicion
        return i;
    }

    // verifica si en la linea leida esta el numero de cuenta ingresado
    // devuelve true si es ese o false si no
    // ln - la linea tomada de la lista
    // c - el numero de cuenta ingrsado por el usuario
    boolean Verificador(String ln, int c){
        // variable para retorno
        boolean retorno = false;
        // encontramos el primer ";" que es el delimitador
        int ind = ln.indexOf(";"), i = 0;
        // convertimos la subcadena en entero
        i = Integer.parseInt(ln.substring(0, ind));
        // comparamos el resultado
        if (i == c) { retorno = true; }
        // retornamos el resultado
        return retorno;
    }

    // esta funci�n convierte un string en un objeto de cuenta habiente
    // ln - linea a convertir
    // ch - objeto de cuenta habiente para guardar la informac�n
    // i - para guardar en el objeto el index
    void ConvierteObjeto(String ln, CuentaHabiente ch, int i){
        // variables para manejar los indices
        int ind1 = 0, ind2 = 0;

        // guardamos el indice en el objeto
        ch.setIndex(i);

        // capturamos el numero de cuenta
        ind2 = ln.indexOf(";");
        ch.setCuenta(Integer.parseInt(ln.substring(0, ind2)));
        
     // capturamos el saldo
        ind1 = ind2 + 1;
        ind2 = ln.indexOf(";", ind1);//
        ch.setSaldo(Double.parseDouble(ln.substring(ind1,ind2)));
        // capturamos el nombre
        ind1 = ind2 + 1;
        ind2 = ln.indexOf(";", ind1);
        ch.setUsuario(ln.substring(ind1, ind2));

        //ind1 = ind2 + 1;
        //ind2 = ln.indexOf(";", ind1);//
        //ch.setSaldo(Double.parseDouble(ln.substring(ind1,ind2)));
        // capturamos la direccion
        ind1 = ind2 + 1;
        ind2 = ln.indexOf(";", ind1);
        ch.setFecha();
        //ch.setFecha(ln.substring(ind1, ind2));

        // capturamos el telefono
        ind1 = ind2 + 1;
        ind2 = ln.indexOf(";", ind1);
        ch.setHora();
        //ch.setHora(ln.substring(ind1, ind2));
     
        
        //ch.setSaldo(Double.parseDouble(ln.substring(ind1)));
    }

    void LeerBT(String path, LinkedList<String> l){

        File fl = null;         // objeto tipo file
        FileReader fr = null;   // objeto tipo file reader
        String ln;              // string para capturar lectura

        try {
            // inicializamos los objetos para lectura de archivo
            fl = new File(path);
            fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            // iniciamos el ciclo de lectura y lo enviamos a la lista
            while ((ln = br.readLine()) != null) { l.add(ln); }
        } catch (Exception e) {
            // en caso de un error muostramos el mensaje y retornamos false
            System.out.println("No se ha encontrado el archivo!!!");
        } finally {
            try {
                // cerramos el archivo abierto
                if (fr != null) { fr.close(); }
            } catch (Exception e) {
                // si hay error informamos al usuario
                System.out.println("Error al cerrar el archivo!!!");
            }
        }
    }

    void EscribirBT(String path, String ln){
        // creamos los objetos
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        // vigilamos la ejecucion del codigo que puede generar excepciones
        try {
            // los inicializamos
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.println(ln);
        } catch (Exception e) {
            // capturamos la excepcion, si la hubiera
            System.out.println("Error de escritura");
        } finally {
            try {
                // cerramos el archivo
                if (pw != null) { pw.close(); }
            } catch (Exception e) {
                // si hubiera excepcion la capturamos
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    void EscribirCH(String path, String l, int p){
        // creamos los objetos
        File fl = null;
        RandomAccessFile raf = null;

        // vigilamos la ejecucion del codigo que puede generar excepciones
        try {
            // los inicializamos
            fl = new File(path);
            raf = new RandomAccessFile(fl, "rw");
            for (int i = 0; i < p; i++) { raf.readLine(); }
            raf.writeBytes(l);
        } catch (Exception e) {
            // capturamos la excepcion, si la hubiera
            System.out.println("Error de escritura");
        } finally {
            try {
                // cerramos el archivo
                if (raf != null) { raf.close(); }
            } catch (Exception e) {
                // si hubiera excepcion la capturamos
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}