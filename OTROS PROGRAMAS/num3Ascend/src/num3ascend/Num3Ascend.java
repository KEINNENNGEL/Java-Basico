/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package num3ascend;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class Num3Ascend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        do{
            try{
                a=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL # 1"));
                b=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL # 2"));
                c=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL # 3"));
                if (a<b && b<c){
                    JOptionPane.showMessageDialog(null,"El resultado es\n"+c+"\n"+b+"\n"+a);
                }else if(b<a && a<c){
                    JOptionPane.showMessageDialog(null,"El resultado es\n"+c+"\n"+a+"\n"+b);
                }else if(b<c && c<a){
                    JOptionPane.showMessageDialog(null,"El resultado es\n"+a+"\n"+c+"\n"+b);
                }else if(c<a && a<b){
                    JOptionPane.showMessageDialog(null,"El resultado es\n"+b+"\n"+a+"\n"+c);
                }else if(c<b && b<a){
                    JOptionPane.showMessageDialog(null,"El resultado es\n"+a+"\n"+b+"\n"+c);
                }
            }catch(Exception f){
                JOptionPane.showMessageDialog(null,"ERROR VUELVE A INTENTARLO");
            }
        }while(a==0&&b==0&&c==0);
    }
}
