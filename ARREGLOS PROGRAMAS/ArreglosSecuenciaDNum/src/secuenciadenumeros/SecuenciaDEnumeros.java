/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciadenumeros;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class SecuenciaDEnumeros {

    /**2
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero[]=new int[20];
        int i,j=0;
        int mayor=numero[j];
        int menor=numero[0];
        for(i=0;i<numero.length;i++){
            numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"+(i+1)));
            if(numero[i]==0)
                break;
        }
        for(i=0;i<numero.length;i++){
            if (numero[i]<-numero[i]){
                menor=numero[i];
                JOptionPane.showMessageDialog(null,"NUMERO NEGATIVO\n"+menor);
            }
            if(numero[i]>0)
                mayor=numero[i];
                JOptionPane.showMessageDialog(null,"NUMERO MAYOR\n"+mayor);
        }
    }
}
