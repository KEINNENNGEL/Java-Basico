/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos10numcubocuadrado;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class Arreglos10numCuboCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int numeros[]=new int[10];
        try{
        for(i=0;i<numeros.length;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null," NUMERO "+(i+1)+ " DE "+numeros.length));
                
        }
        for(i=0;i<numeros.length;i++){
            JOptionPane.showMessageDialog(null,"NUMERO:       "+numeros[i]+"\nCUADRADO: \t"+numeros[i]*numeros[i]+"\nAL CUBO:      "+numeros[i]*numeros[i]*numeros[i]);
        }
          }catch(Exception z){
              JOptionPane.showMessageDialog(null,"ERROR");
        }
    }
}
