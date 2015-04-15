/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holaif;

/**
 *
 * @author aw
 */

import javax.swing.JOptionPane;


public class HolaIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=0; i<10;i++){//declaracion del for i igual a cero ; e i debe ejecutarse no mas de 10 ; i incremento, y se abre la llave del for
        JOptionPane.showMessageDialog(null, "HOLA JAVA CON IF");//msj que mostrara 10 veces HOLA JAVA CON IF
    } // se cierra la llave del for
        
    }
}
