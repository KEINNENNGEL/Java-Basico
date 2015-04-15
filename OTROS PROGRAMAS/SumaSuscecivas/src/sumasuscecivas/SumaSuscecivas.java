/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumasuscecivas;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class SumaSuscecivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma=0;
        int a=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero para obtener el producto"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero dos"));
       
        for(int i=1;i<=b;i++){
          suma=suma+a;
          JOptionPane.showMessageDialog(null,+a+"+"+b+"="+suma);
       }
    }
}

