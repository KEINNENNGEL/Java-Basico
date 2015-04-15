/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosumaoresta;


/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;

public class MetodoSumaOresta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opc;
      String opcion;
      Metodoclasesuma suma=new Metodoclasesuma();//creo un metodo de instancia suma
      Metodoclasesuma resta=new Metodoclasesuma();//creo un metodo de instancia resta
      try{//try para las excepciones
          opcion=JOptionPane.showInputDialog("que operacion desea realizar + o -");//msj que muesra que operacion se deseea realzar
          opc=opcion.charAt(0);//convieerto el entro opc en char
          if(opcion.equals("+")){//si + entonces realiza la operacion
              int  num1 =Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN VALOR ENTERO" ));//declaracion y conversion de la var asi como pide al usuario introducir una var
              int  num2 =Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN SEGUNDO VALOR ENTERO"));//declaracion de vaar y conversion a entero y pide al usuario que introduzca un valor
              suma.sumar(num1, num2);/7llamo mi instacia asi como realiza la operCION  DE LOS DATOS INTRODUCIDOS NUM1 Y NUM2
          }
          else if("-".equals(opcion)) {//si opcin es - entonces realiza la operacion
              int  num1 =Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN VALOR ENTERO" ));//declarcion de var y convercion a entero asi como pide al usuario un valo
              int  num2 =Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN SEGUNDO VALOR ENTERO"));    //declaracion de var y conversion del valor que se introdujo
              resta.restar(num1, num2);//llamo mi intaancia asi como el metodo que tengo en la otra clase
          }
      }catch(Exception j){//catch 
          JOptionPane.showMessageDialog(null,"ERROR VUELVE A INTENTARLO");//msj en el caaso que hay aun error 
      }
    }
}
        
       
   

