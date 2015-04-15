/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creararxhivotexto;

/**
 *
 * @author aw
 */
import java.io.*;
public class CrearArxhivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EscribirTexto escribir=new EscribirTexto();
        System.out.println("escribe algo");
        
        try{
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader leer=new BufferedReader(in);
            escribir.escribeTxt(leer.readLine());
            
            
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
    }
}
