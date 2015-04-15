/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaoresta01;

/**
 *
 * @author aw
 */

import javax.swing.JOptionPane;
public class SumaOresta01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a1, b1;
        int num1,num2,sum,rest ;
        String valor ;
        valor = JOptionPane.showInputDialog (" QUE DESEA REALIZAR +/-");
        a1 = JOptionPane.showInputDialog("INTRODUCE UN VALOR ENTERO" );
        b1 = JOptionPane.showInputDialog("INTRODUCE UN SEGUNDO VALOR ENTERO");
        num1=Integer.parseInt(a1);
        num2=Integer.parseInt(b1);
        
        if ( "+".equals(valor)) {
           
             sum=num1+num2;
            JOptionPane.showMessageDialog (null,"EL RESULTADO DE TU SUMA ES; " + sum);
        }
        else if("-".equals(valor)) {
            
       rest=num1-num2;
       JOptionPane.showMessageDialog (null,"EL RESULTADO DE TU RESTA ES ; " + rest);
 }

    }
}
