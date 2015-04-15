/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecasa;
import javax.swing.JOptionPane;
/**
 *
 * @author aw
 */
public class Casa {
    String color;
    String tipo;
    double alto;
    double ancho;
    String Dueño;
    int CuantosCuartos;
    
  Casa(){
    color="rojo";
    tipo="residencia";
    alto=10.5;
    ancho=36.5;
    Dueño="miguel angel";
    CuantosCuartos=10;
    imprimir(color+tipo+alto+ancho+Dueño+CuantosCuartos);
        
    }
   Casa(boolean si){
    color="a";
    tipo="residencia";
    alto=10.5;
    ancho=15.4;
    Dueño="miguel angel";
    CuantosCuartos=10;
    imprimir(color+tipo+alto+ancho+Dueño+CuantosCuartos);
    sevende(si);
    vendido(si);
        
    }
   public static void sevende(boolean si){
      // JOptionPane.showInputDialog("usted desea comprar esta casa");
       if(si){
           
       JOptionPane.showMessageDialog(null,"felicidades por su nueva casa");
       }//else if(no){
           
       //JOptionPane.showMessageDialog(null,"mmmm... lastima");
       //}
       //return si;
   }
   public static boolean vendido(boolean si){
       if (!si){
           JOptionPane.showMessageDialog(null,"mmmmm...que chafa");
       }return si;
       
       
   }
   public static void imprimir(String a){
       JOptionPane.showMessageDialog(null,a);
   }
    
}
