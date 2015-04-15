/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionesmetodoclase;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class ConversionesMetodoClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion; //dclaracion de la variable de tipod string
        char opc;//declaracion de char  opc
        ConvMClases pesos=new ConvMClases();//creo un metodo de intancia
        ConvMClases kg=new ConvMClases();//creo un nuevo metodo de instancia kg
        ConvMClases millas=new ConvMClases();//creo un nuevo mettodo de intancia millas
        ConvMClases msj=new ConvMClases();//creo un nuevo metodo de instaancias msj
     //pedir al usuario que tipo de operacion desea realizar
        opcion = JOptionPane.showInputDialog("usted desea convertir \n1.- $ a dolares,euros,libras...\n2.- kg a libras\n3.- km a millas");
        opc = opcion.charAt(0);//convirtiendo nuestra variable string en caracter
      
        switch (opc){
            
           case '1'://caso 1 si es = a 1 entonces realiza la operacion
            pesos.conversionpesos();//llamo mi instancia y mi metodo que tengo en la otra clase
           break;
                
            case '2'://caso 2 si el valor introducido es = a 2 entonces realiza la operacion 
               kg.conversionKg();//llamo mi instancia y el metodo de la otra clase que realiza las operacines
                break;
                
            case '3'://caso 3 si el valor introducido es igual a 3 entonces realiza la operacion 
               millas.conversionmillas();//llamo mi instancia millas  y mi metodo que tengo en la otra clase
                break;
            default:// mensaje por default
              msj.mensaje();  
                  
      }
        
    }
      
       
}
