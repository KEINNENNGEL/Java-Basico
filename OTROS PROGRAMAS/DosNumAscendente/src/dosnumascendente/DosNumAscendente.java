/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dosnumascendente;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class DosNumAscendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=0;
        do{
            try{
                a=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 1"));
                b=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 2"));
                if (a>b){
                    JOptionPane.showMessageDialog(null,"LOS NUMEROS INTRODUCIDOS EN FORMA ASCENDENTE SON " +"\n"+ b +"\n"+ a);
                }else if(b>a){
                    JOptionPane.showMessageDialog(null,"LOS NUMEROS EN FORMA ASCENDENTE"+"\n"+ a +"\n"+b);
                }else if(a==b){
                    JOptionPane.showMessageDialog(null,"NUMEROS IGUALES "+a+" = "+b);
                }
            }catch(Exception g){
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }while(a==0 && b==0);
    }
}
