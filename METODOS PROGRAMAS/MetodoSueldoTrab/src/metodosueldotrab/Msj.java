/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosueldotrab;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class Msj {
    public void oo(){
        double sueldoBRUTO,sueldoISR,sueldoSS;//declarando las variables de tipo double
        double horastrab;//declaracion de la variable de tipo double
        int dias;//declaracion de la variable de tipo int
        double pagohora;//declaracion de la variable de tipo double
        String nombre,opcion,apellidos,cargo;//declarcion de las varibales de tipo string
        double sueldototal;// declaracion de la variable de tipo double
         nombre= JOptionPane.showInputDialog("INTRODUCE EL NOMBRE DEL TRABAJADOR");//pide al usuario introducir el nombre del trabajador y la almacena en la variable nombre
         apellidos =  JOptionPane.showInputDialog("INTRODUCE LOS APELLIDOS DEL TRABAJADOR");//pide al usuario introducir los apellidos del trabajador y la almacena en la variable apellidos
         cargo= JOptionPane.showInputDialog("INTRODUCE EL CARGO DEL EMPLEADO");//pide al usuario introducir el cargo del trabajador y la almacena en la variable cargo
         horastrab=Double.parseDouble(JOptionPane.showInputDialog("INTRODUCE LAS HORAS TRABAJADAS"));//pide las horas trabajadas y la almacena en la variable horastrab
         dias=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LOS DIAS TRABAJADOS"));//pide los dias trabajados y la almacena en la variable dias
         pagohora=Double.parseDouble(JOptionPane.showInputDialog("INTRODUCE EL PAGO POR HORA"));//pide el pago x hora trabajado y la almacena en la variable pagohora
          
         sueldoBRUTO=(horastrab*pagohora)*dias;//realiza la oparcion del sueldo bruto
         sueldoSS=(sueldoBRUTO*5)/100;//realizando la operacion para sacar el % del seguro sosial
         sueldoISR=(sueldoBRUTO*10)/100;//realiando la operacion para sacar el % del ISR
         sueldototal=sueldoBRUTO-(sueldoSS+sueldoISR);//realizando la operacion del sueldo total menos el SS Y EL ISR
           //MUESTRA EL RESULTADO 
         JOptionPane.showMessageDialog(null,"Nombre y Apellidos " + nombre + apellidos +"\nSUELDO BRUTO "+sueldoBRUTO+"\nDESCUENTO ISR "+sueldoISR+"\nSEGURO "+sueldoSS+"\nCARGO " + cargo + "\nSUELDO "+ sueldototal);
        
    
}
}
