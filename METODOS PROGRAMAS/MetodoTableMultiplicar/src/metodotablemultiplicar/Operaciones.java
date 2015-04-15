/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodotablemultiplicar;

import javax.swing.JOptionPane;//importando el JOptionPane

/**
 *
 * @author aw
 */
public class Operaciones {//nombre de la clase principal
    public void msj(){//declarando un metodo que es msj
        String opcion = JOptionPane.showInputDialog("introduce la tabla a visualizar");//pide al usuario introducir un numero para poder visualizar la tabla de multiplicar
        int opc=Integer.parseInt(opcion);//convirteindo el valor introducido opcion e entero opc
        for( int i=1; i<11; i++){//declarando la sentencia for
            JOptionPane.showMessageDialog(null,+opc+" X "+ i +"=" +(i*opc));//realizando la operacion de la multiplicacion y muestra al usuario el resultado
       }//fin de la sentencia
//        return opc;
//        
    } 
    
}
