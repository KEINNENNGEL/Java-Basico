
package sumatry;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class SumaTry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a=0,b=0,r;
        do{
          try{
             a=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
             b=Integer.parseInt(JOptionPane.showInputDialog("introduce otro numero"));
              }catch(Exception e){
              JOptionPane.showMessageDialog(null,"error te pedi un numero uno");
            }
         }while(a==0 && b==0);
             r=a+b;
  
             JOptionPane.showMessageDialog(null,"el resultado " + r);
   
    }
}
