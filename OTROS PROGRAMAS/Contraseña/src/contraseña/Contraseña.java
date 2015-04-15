/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class Contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String contrasena="admin";
        do{
            contrasena=JOptionPane.showInputDialog("INTRODUCE LA CONTRASEÑA");
            if(contrasena.equals("admin")){
            JOptionPane.showMessageDialog(null,"Bienvenido");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error");
                contrasena=null;
            }
        }while(contrasena==null);
    }
}
/*
 * int a=0,b=0;
 * 
 * try{
 * a=Intger.parseInt(JOptionPane.show("numero uno");
 * b=Intger.parseInt(JOptionPane.show("numero dos");
 * }catch(Exception e){
 * JOptionPane.showMessageDialog(null,"error te pedi un numero uno");
 * 
 * }
 * r=a+b;
 * 
 * JOptionPane.showMessageDialog(null"el resultado"+r);
 */
