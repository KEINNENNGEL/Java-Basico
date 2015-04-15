/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jovenoviejo;
import javax.swing.JOptionPane;
/**
 *
 * @author aw
 */
public class JovenOviejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad=0;
        do{
            try{
                edad=Integer.parseInt(JOptionPane.showInputDialog("cual es tu edad"));
                if (edad<=45){
                    JOptionPane.showMessageDialog(null,"ERES JOVEN");
                }else if (edad>45)
                    JOptionPane.showMessageDialog(null,"ERES VIEJO");
            }catch(Exception f){
                JOptionPane.showMessageDialog(null,"ERROR INTENTA OTRA VEZ");
            }
        }while(edad==0);
     }
}
