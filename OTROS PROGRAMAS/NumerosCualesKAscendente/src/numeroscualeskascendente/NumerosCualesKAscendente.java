/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscualeskascendente;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class NumerosCualesKAscendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
       int a=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 1"));
       int b=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 2"));
       int c=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 3"));
       
       if (a>b && a>c){
           JOptionPane.showMessageDialog(null,"LOS NUMEROS INTRODUCIDOS EN FORMA ASCENDENTE SON " +"\n"+ c +"\n"+ b+"\n"+a);
       }else if(b>a && a>c)
           JOptionPane.showMessageDialog(null,"LOS NUMEROS EN FORMA ASCENDENTE"+"\n"+ b+"\n"+c+"\n"+a);
       else if (c>b && c>a){
               JOptionPane.showMessageDialog(null,"LOS NUMEROS EN FORMA ASCENDENTE"+"\n"+ b +"\n"+a+"\n"+c);
    }      
        }catch(Exception g){
            JOptionPane.showMessageDialog(null,"VUELVE A INTENRALO");
        
        }     
    }
}
