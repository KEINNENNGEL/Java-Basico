/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;//importando

public class OPERAcionesBasicas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String opcion,res ;//declaracion de la variable de tipo string
        char opc=0;//declarando la variable de tipo char
        int resultado,num1,num2,res1;//declarando las variables 
       do{
           try{
        opcion = JOptionPane.showInputDialog("que desea realizar\n +\n-\n*\n/ ");//muestra y pide al usuario si desea realizar + - * o /
        opc = opcion.charAt (0);// convirtiendo el valor introducido en char
        num1=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 1"));//pide al usuario en numero 1 y hace la convercion a entero
        num2=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 2"));//pide al usuario el numeor 2 y hace la convercion a entero
        switch (opc){//declaracion de la sentencia switch
            case '+'://caso 1 si el valor introducido es + entonces realizara la opracion 
                resultado = num1+num2;//realiza la operacion de la suma
                JOptionPane.showMessageDialog(null,"el resultado es "+ resultado);//muestra el resultado de la operacion
                break;//termina  el caso1
            case '-'://caso 2 si el valor introducido es - entonces realizara la operacion
                resultado = num1-num2;//realiza la resta 
                JOptionPane.showMessageDialog(null,"el resultado es "+ resultado);//muestra el resultado
                        break;//termina el caso 2
            case '*'://caso 3 si el valor introducido es * entonces realizara la operacion
                resultado = num1*num2;////realiza la opearacion
                JOptionPane.showMessageDialog(null,"el resultado es "+ resultado);//muestra el resultado
                break;//termina el caso 3
            case '/'://caso 4 si el valor introducido es / realizara la operacion
                resultado = num1/num2;//realiza la operacion
                JOptionPane.showMessageDialog(null,"el resultado es "+ resultado);//muestra el resultado
                break;//termina el caso 4
            default://caso por default
                    JOptionPane.showMessageDialog(null, "Error");//muestra el msj por default
                    break;//termina el dafault
        }
         }catch(Exception y){
               JOptionPane.showMessageDialog(null,"ERROR VUELVE A INTENTARLO");
           }res=JOptionPane.showInputDialog("otra conversion s/n");
        res1=res.charAt(0);
        } while (res1=='s');
    }
}
