/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productodedosnum;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class ProductoDeDosNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=1,a=0,b=0;
        int suma=0;
        do{
            try{
                a=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
                b=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero dos para obtener el producto"));
                if(a>b){
                    while(x<=b){
                        suma+=+a;
                        JOptionPane.showMessageDialog(null,"el producto de :\n " + a + " * " + b + " = " +(suma));
                        x++;
                    }
                }else if(b>a){
                    while(x<=b){
                        suma+=+a;
                        JOptionPane.showMessageDialog(null,"el producto de :\n " + a + " * " + b + " = " +(suma));
                        x++;
                   }  
               }else if(a==b){
                    while(x<=a){
                        suma+=+b;
                        JOptionPane.showMessageDialog(null,"el producto de :\n " + a + " * " + b + " = " +(suma));
                        x++;
                  }
              }
            }catch(Exception v){
                JOptionPane.showMessageDialog(null,"ERROR INTRODUCE LO QUE SE TE PIDE");
            } 
        }while(a==0&&b==0);
    }
}
