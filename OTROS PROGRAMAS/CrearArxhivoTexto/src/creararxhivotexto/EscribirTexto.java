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
public class EscribirTexto {
    public void escribeTxt(String textonuevo){
        File archivo;
        archivo=new File("nuevo.txt");
        try{
            FileWriter scribe=new FileWriter(archivo);
            BufferedWriter buffere=new BufferedWriter(scribe);
            PrintWriter imprime=new PrintWriter(buffere);
            
            imprime.write(textonuevo);
            imprime.close();
            buffere.close();
            
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
        
    }
    
}
