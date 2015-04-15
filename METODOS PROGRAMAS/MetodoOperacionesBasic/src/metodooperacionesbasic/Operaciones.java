/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodooperacionesbasic;

import javax.swing.JOptionPane;//importando el JOptionPane

/**
 *
 * @author aw
 */
public class Operaciones {//nombre de la clase principal y declaracion
    public void suma(int a,int b){//declaranco el nuevo metodo suma y dos enteros a y b
        int suma=a+b;//declaracion  del suma y la operacion de a+b
        JOptionPane.showMessageDialog(null,"el resutado de la suma es " +suma);//imprimiendo el resultado de a +b
    }//fin del meetodo summa
    public void resta(int a,int b){//nuevo metodo resta y con declaracin de dos enteros a y b
        int resta=a-b;//declaramdo resta y realizando la operacion a-b
        JOptionPane.showMessageDialog(null,"el resutado de la resta es " +resta);//imprrimiendo el resultadoo
        
    }//fin del metodo resta
    public void mulltiplicacion(int a,int b){//nuevo metodo multiplicacion
        int multiplicacion=a*b;//declarando multiplicacion y realizando la operacion
        JOptionPane.showMessageDialog(null,"el resutado de la multiplicacion es " +multiplicacion);//imprimiendo el resultado
        
    }//fin del metodo multiplicacion
    public void Divicion(int a,int b){//declaracion  del nuevo  metodo divicion y declaracion de a a y b
        int divicion=a/b;//declarando unentero divcion y realizando la operacion a/b
        JOptionPane.showMessageDialog(null,"el resutado de la divicion es " +divicion);//imprimiendo el resultado de a/b
    }
    
}
