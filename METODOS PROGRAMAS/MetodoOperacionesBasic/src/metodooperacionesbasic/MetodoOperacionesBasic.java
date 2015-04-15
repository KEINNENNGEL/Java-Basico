/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodooperacionesbasic;

import javax.swing.JOptionPane;//importando la paqueteria del JOptionPane

/**
 *
 * @author aw
 */
public class MetodoOperacionesBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opcion,res ;//declaracion de la variable de tipo string
        char opc=0;//declarando la variable de tipo char
        int resultado,num1,num2,res1;//declarando las variables 
        Operaciones suma=new Operaciones();//creando nuetro metodo de instancia suma
        Operaciones resta=new Operaciones();//creando nuetro metodo de instancia resta
        Operaciones multiplicacion=new Operaciones();//creando nuetro metodo de instancia multiplicacion
        Operaciones divicion=new Operaciones();//creando nuetro metodo de instancia divicion
       do{//declaracion del do 
           try{//declaracion del try catch para las excepciones
        opcion = JOptionPane.showInputDialog("que desea realizar\n +\n-\n*\n/ ");//muestra y pide al usuario si desea realizar + - * o /
        opc = opcion.charAt (0);// convirtiendo el valor introducido en char
        num1=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 1"));//pide al usuario en numero 1 y hace la convercion a entero
        num2=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 2"));//pide al usuario el numeor 2 y hace la convercion a entero
        switch (opc){//declaracion de la sentencia switch
            case '+'://caso 1 si el valor introducido es + entonces realizara la opracion 
                suma.suma(num1, num2);//llamamos nuestra nueva declaracion del metodo suma asi como el metodo de la otra clase que es igual es suma y ocupamos los valores que pedimos que son num1 y num2
                break;//termina  el caso1
            case '-'://caso 2 si el valor introducido es - entonces realizara la operacion
                resta.resta(num1, num2);//llamamos nuestra nueva declaracion del metodo de  instancia resta asi como el metodo de la otra clase que es igual es resta y ocupamos los valores que pedimos que son num1 y num2
                break;//termina el caso 2
            case '*'://caso 3 si el valor introducido es * entonces realizara la operacion
                multiplicacion.mulltiplicacion(num1, num2);//llamamos nuestra nueva declaracion del metodo de intancia multiplicacion asi como el metodo de la otra clase que es igual es multiplicacion y ocupamos los valores que pedimos que son num1 y num2
                break;//termina el caso 3
            case '/'://caso 4 si el valor introducido es / realizara la operacion
                divicion.Divicion(num1, num2);//llamamos nuestra nueva declaracion del metodo de instancia divicion asi como el metodo de la otra clase que es igual es divicion y ocupamos los valores que pedimos que son num1 y num2
                break;//termina el caso 4
            default://caso por default
                    JOptionPane.showMessageDialog(null, "Error");//muestra el msj por default
                    break;//termina el dafault
        }
         }catch(Exception y){
               JOptionPane.showMessageDialog(null,"ERROR VUELVE A INTENTARLO");//msj que se muestra si hay un dato introducido erroneo
           }res=JOptionPane.showInputDialog("otra conversion s/n");//pide al usuario si desea realizar otra operacion
        res1=res.charAt(0);
        } while (res1=='s');//repite la programa si introduce s
    }
}
