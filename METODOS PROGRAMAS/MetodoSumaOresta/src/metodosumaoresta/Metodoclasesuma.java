8/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosumaoresta;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;

public class Metodoclasesuma {//clase principal
   
         public void sumar(int a, int b){//metodo sumar
             int suma;//var suma
             try {//try para las excepciones
                 suma=a+b;//operacion de la suma 
                 JOptionPane.showMessageDialog(null,"el resutado de la suma es " +suma);//imprimo el resultado
             }catch(Exception o){//declaro mi excepcion
                 JOptionPane.showMessageDialog(null,"ERROR");//muestra un msj por si hay un dato introducido erroneo
             }fin catch
    }fin metodo
         public void restar(int a, int b){//nuevo metodo restar y declaracin de a y b
             int resta;//var resta
             try{//try para las excepciones
             resta=a-b;//operacion de a -b
             JOptionPane.showMessageDialog(null,"el resultado de la resta es"+ resta);//muestro un msj
             }catch (Exception l){
                 JOptionPane.showMessageDialog(null,"Error");//msj en el caso si hay algun error
             }fin catch
         }fin metodo
}fin clase




