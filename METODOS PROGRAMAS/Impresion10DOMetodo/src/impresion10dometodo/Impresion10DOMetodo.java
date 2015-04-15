/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package impresion10dometodo;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class Impresion10DOMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimenumerosdo();//llamo a i metodo imprimenumeros do
    }//fin del metodo main
    
    public static void imprimenumerosdo(){//deeclaro un metodo nuevo
        int i=1;//declaracion de la constante i
        while (i<11){//declarando la sentencia while i menor a 11
          JOptionPane.showMessageDialog(null,"el resultado es " + i);//muestra el resultado del incremento
          i++;//incremento
            
        }//fin de la senetncia while
    }
}
