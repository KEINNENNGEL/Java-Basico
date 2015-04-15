/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

/**
 *
 * @author aw
 */
import java.io.*;
import javax.swing.JOptionPane;
 
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{ //declarando una excepcion
        
        String opcion; //dclaracion de la variable de tipod string
        char opc;
        double a;//declaracion de variable tipo double
        double dolares=13.0199,euros=17.06,libras=20.388,millas=1.6;//declaracion de constantes de tipo double
        double libra=0.450,libra2;//declaracion de constantes de tipo double
        //pedir al usuario que tipo de operacion desea realizar
        do{
            try{
        opcion = JOptionPane.showInputDialog("usted desea convertir \n 1 $ a dolares,euros,libras...\n  2 kg a libras\n o \n 3 km a millas");
        opc = opcion.charAt(0);//convirtiendo nuestra variable string en caracter
        switch (opc){
            case '1'://caso 1 si es = a 1 entonces realiza la operacion
               a=Double.parseDouble(JOptionPane.showInputDialog("introduce los pesos a convertir"));//pide al usuario que introduzca los pesos a convertir y a la vez convierte el valor  a double
               dolares=a/dolares;//realiza la operacion de pesos a dolares
               euros=a/euros;//realiza la operacion de pesos a auros
               libras=a/libras;//realiza la operacion de pesos a libras
               JOptionPane.showMessageDialog(null,"la conversion es : \n" + dolares +" dolares"+"\n" +euros +" euros \n" +libras+ " libras");//ejecuta el resultado de las operaciones anteriores
                break;
            case '2'://caso 2 si el valor introducido es = a 2 entonces realiza la operacion 
                a=Double.parseDouble(JOptionPane.showInputDialog("introduce los kilogramos a convertir"));//pide al usuario los kilogramos a convertir y convierte ek valor a double
                    libra2=a/libra;//realiza la operacion de kilogramos a libras
                JOptionPane.showMessageDialog(null,"la conversion es : " + libra2+ "libras");//ejecuta el resultado de la operacion anterior
                break;
            case '3'://caso 3 si el valor introducido es igual a 3 entonces realiza la operacion 
                a=Double.parseDouble(JOptionPane.showInputDialog("Introduce los km a convertir"));//pide al usuario que introduzca los km a convertir y convierte el valor a double
                millas=a/millas;//se realiza la opreracion de km a millas
                JOptionPane.showMessageDialog(null,"la conversion es :"+ millas + "millas");// se ejecuta o muestra el resultado de la operacion
                break;
            default:// mensaje por default
                JOptionPane.showMessageDialog(null,"Error");// mensaje que mostrara el msj por default
        }
        
            }catch(Exception g){
              JOptionPane.showMessageDialog(null,"ERROR");  
            }
            opcion=JOptionPane.showInputDialog("DESEA CONTINUAR\n s = si\nn = no");
        opc=opcion.charAt(0);
    }while(opc!='n');
   }
}
