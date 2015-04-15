/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numcrcientsorden;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class NumCrcientsOrden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0 , b=0, c=0;
        do{
        try{
        a=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 1"));
        b=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 2"));
        c=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 3"));
        
        if (a>b && b>c){
            JOptionPane.showMessageDialog(null,"El resultado es\n"+c+"\n"+b+"\n"+a);
        }else if(b>a && a>c){
            JOptionPane.showMessageDialog(null,"El resultado es\n"+c+"\n"+a+"\n"+b);
        }else if(b>c && c>a){
            JOptionPane.showMessageDialog(null,"El resultado es\n"+a+"\n"+c+"\n"+b);
        }else if(c>a && a>b){
            JOptionPane.showMessageDialog(null,"El resultado es\n"+b+"\n"+a+"\n"+c);
        }else if(c>b && b>a){
            JOptionPane.showMessageDialog(null,"El resultado es\n"+a+"\n"+b+"\n"+c+"\n LOS NUMEROS FUERON INTRODUCIDOS ASI COMO ESTAN");
        }else if(a>c && c>b){
            JOptionPane.showMessageDialog(null,"El resultado es\n"+b+"\n"+c+"\n"+a);
            
        }
        }catch(Exception z){
            JOptionPane.showMessageDialog(null,"ERROR VUELVE A INTENTARLO");
        }
        }while(a==0&&b==0&&c==0);
    }
}
