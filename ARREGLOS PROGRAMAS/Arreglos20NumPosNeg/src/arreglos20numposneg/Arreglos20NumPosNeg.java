/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos20numposneg;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class Arreglos20NumPosNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[]=new int[20];
        int i;
        int negativos=0,neutros=0,positivos=0;
        for(i=0;i<numeros.length;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE CUALQUIER NUMERO "+(i+1)+" DE "+numeros.length));
         }
        for(i=0;i<numeros.length;i++)
         if(numeros[i]==0){
            neutros++;
            JOptionPane.showMessageDialog(null,"NEUTROS SON \n"+ neutros +"\n"+numeros[i]);
         }
        for(i=0;i<numeros.length;i++)// {       
         if(numeros[i]<0){
            negativos--;
            JOptionPane.showMessageDialog(null,"NEGATIVOS\n "+(-(negativos))+"\n"+numeros[i]);
         }
        for(i=0;i<numeros.length;i++){
         if(numeros[i]>0){
            positivos++;
            JOptionPane.showMessageDialog(null,"POSITIVOS\n"+ positivos+"\n"+numeros[i]);
                }
        }
    }
}
    //}
//}
