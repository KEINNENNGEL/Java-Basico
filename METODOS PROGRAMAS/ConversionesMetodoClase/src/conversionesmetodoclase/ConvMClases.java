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
public class ConvMClases {
    
    public void conversionpesos(){
        double a,dolares=13.0199,euros=17.06,libras=20.388;
         a=Double.parseDouble(JOptionPane.showInputDialog("introduce los pesos a convertir"));//pide al usuario que introduzca los pesos a convertir y a la vez convierte el valor  a double
         dolares=a/dolares;//realiza la operacion de pesos a dolares
         euros=a/euros;//realiza la operacion de pesos a auros
         libras=a/libras;//realiza la operacion de pesos a libras
         JOptionPane.showMessageDialog(null,"la conversion es : \n" + dolares +" dolares"+"\n" +euros +" euros \n" +libras+ " libras");//ejecuta el resultado de las operaciones anteriores
    }
    public void conversionKg(){
         double a,libra=0.450,libra2;//declaracion de constantes de tipo double
         a=Double.parseDouble(JOptionPane.showInputDialog("introduce los kilogramos a convertir"));//pide al usuario los kilogramos a convertir y convierte ek valor a double
         libra2=a/libra;//realiza la operacion de kilogramos a libras
         JOptionPane.showMessageDialog(null,"la conversion es : " + libra2+ " libras");//ejecuta el resultado de la operacion anterior
    }
    public void conversionmillas(){
        double a,millas=1.6;//declaracion de constantes de tipo double
         a=Double.parseDouble(JOptionPane.showInputDialog("Introduce los km a convertir"));//pide al usuario que introduzca los km a convertir y convierte el valor a double
         millas=a/millas;//se realiza la opreracion de km a millas
         JOptionPane.showMessageDialog(null,"la conversion es : "+ millas + " millas");// se ejecuta o muestra el resultado de la operacion
    }
    public void mensaje(){
        JOptionPane.showMessageDialog(null,"Error");
    }
}
