/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package automivilclase;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class Auto {
    String marca;
    String color;
    String modelo;
    int  velocidad;
    Double peso;
    Double altura;
    Double ancho;
    int puertas;
    
    Auto(){
        color= "rojo";
        marca= "camaro";
        modelo="2012";
        peso= 1000.0;
        altura=1.50;
        ancho=2.5;
        velocidad=180;
        puertas=4;
        imprimir(color + marca + modelo + peso + altura + ancho + velocidad + puertas);
    }
    Auto(boolean estado){
        color= "azul";
        marca= "camaro";
        modelo="2012";
        peso= 1000.0;
        altura=1.50;
        ancho=2.5;
        velocidad=180;
        puertas=4;
        imprimir(color + marca + modelo + peso + altura + ancho + velocidad + puertas);
         // encendido();
          //apagado();
        encendido(estado);
        apagado(estado);
    }
     //  public static void encendido(){
       //    imprimir("estoy encendido ");
           
      // }
    public static boolean encendido( boolean a){
       if(a){
           imprimir("estoy encendido ");
       }
       return a;
   }
      // public static void apagado(){
        //   imprimir("estoy apagado :(");
       //}
    public static boolean apagado(boolean a){
       if(!a){
           imprimir("estoy apagado :(");
       }
       return a;
   }
       
    public static void imprimir(String s){
                   JOptionPane.showMessageDialog(null,s);
            // System.out.println(s);  
   }
    
}
