/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablademultiplicar;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;//importando 

public class TablaDEmultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       String opcion;//variable de tipo string
        int opc;//variable de tipo entero
        
        opcion = JOptionPane.showInputDialog("introduce la tabla a visualizar");//pide al usuario introducir un numero para poder visualizar la tabla de multiplicar
       opc=Integer.parseInt(opcion);//convirteindo el valor introducido opcion e entero opc
      for( int i=1; i<11; i++){//declarando la sentencia for
            JOptionPane.showMessageDialog(null,+opc+" X "+ i +"=" +(i*opc));//realizando la operacion de la multiplicacion y muestra al usuario el resultado
       }//fin de la sentencia
    }
}
