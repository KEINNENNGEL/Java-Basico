/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imprime10numeroswhile;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;

public class Imprime10numeroswhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i=1;//declaracion de la constante i
        while (i<11){//declarando la sentencia while i menor a 11
          JOptionPane.showMessageDialog(null,"el resultado es " + i);//muestra el resultado del incremento
          i++;//incremento
            
        }//fin de la senetncia while
             
    }
}
