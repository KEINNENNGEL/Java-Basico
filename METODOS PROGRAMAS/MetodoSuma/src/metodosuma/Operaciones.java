/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosuma;

import javax.swing.JOptionPane;//importo la paqueteria JOptionPane

/**
 *
 * @author aw
 */
public class Operaciones {//nombre de la clase principal
    public void suma(int a, int b){//declaro un nuevo metodo
        int suma=a+b;//declaro la var suma y realizo la operacion de a +b que declare en le metodo
        JOptionPane.showMessageDialog(null,"el resutado de la suma es " +suma);//imprimo el resultado
    }
    
}
