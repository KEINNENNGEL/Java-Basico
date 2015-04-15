/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimosb;

/**
 *
 * @author aw
 */

import javax.swing.JOptionPane;

public class NumerosPrimosB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0; //declaracion de variable numero de tipo entero
        int i=0;//declaracion de la constante i de tipo entero
        do{
        try{
       numero = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero"));//pide al usuario que introduzca un numero
       for(int numA=1;numA<=numero;numA++){//declaracion de la sentencia for
            for(int numXnum=1;numXnum<numA;numXnum++){//declarando la senetncia for dentro del for
                if(numA%numXnum==0){//declarando la sentencia if dentro del for
                    i=i+1;//realiza el incremento
                }//fin de la sentencia if
                }//fin de la segunda sentencia for
            if(i<3){//
                    JOptionPane.showMessageDialog(null,"es primo\n" + numA);//muestra el msj 
            }
                            i=0;
        }
        }catch(Exception x){
            JOptionPane.showMessageDialog(null,"ERROR");
        }
        }while(numero==0);
    }
}
