/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imprime10numerosdo;

/**
 *
 * @author aw
 */

import javax.swing.JOptionPane;//importando javax.swing.JOptionPane;

public class Imprime10numerosdo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=10;//declarcion de la constante i
        do {//sentencia do
            JOptionPane.showMessageDialog(null,"el resultado es "+i);//muestra el resultado
            
            i=i-1;//realiza el decremento
        }while (i<10 & i>0);//realiza la operacion del decremento i menor a 10 y terminara en i>0
        
    }
}
