/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosuma;

/**
 *
 * @author aw
 */import javax.swing.JOptionPane;
public class MetodoSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a1, b1;//VARIABLES DE TIPO STRING
        int num1,num2,sum ;//VARIABLES DE TIPO ENTERO
        Operaciones suma=new Operaciones();//declarando un nuevo metodo de instancia 

        a1 = JOptionPane.showInputDialog ("INTRODUCE EL #1");//PIDE AL USUARIO EL NUMERO 1 Y LA ALMACENA EN LA VARIABLE a1
        b1 = JOptionPane.showInputDialog ("INTRODUCE EL #2");//pide al usuario el numero 2 y la almacena en la variable a2
        num1=Integer.parseInt(a1);//realiza la convercion de los datos introducidos a1 a num2 como entero
        num2=Integer.parseInt(b1);//realiza la convercion de los datos introducidos a2 a num2 como entero
        //sum=num1+num2;//realiza la suma de num1 + num2
        suma.suma(num1, num2);//utilizo las variables que introduci para realizar la operacion
        if(num1+num2>100){//declarcion de la sentencia if
            JOptionPane.showMessageDialog (null,"LA CANTIDAD DE " + (num1+num2) + " ES MUCHOO ");//muestra el resultado si es mayor a 100
        }


            else {//si no
            JOptionPane.showMessageDialog(null,"LA CANTIDAD DE " + (num1+num2) +" ES POCO " );//muestra que el resultado es poco
        }//fin de la sentencia 
        JOptionPane.showMessageDialog(null," :P ");//msj


    }

}

    

