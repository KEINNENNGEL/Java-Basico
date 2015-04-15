/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chaparro;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class Chaparro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double estatura=0.0;
        do{
            try{
                estatura=Double.parseDouble(JOptionPane.showInputDialog("introduce tu estatura"));
                if (estatura<=1.65){
                    JOptionPane.showMessageDialog(null,"ERES CHAPARRO :p");
                }else if(estatura>1.65)
                    JOptionPane.showMessageDialog(null,"ERES GRANDE ");
            }catch(Exception a){
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }while(estatura==0);
    }
}

//class verificador{
//    public static int obtenerint(String Otro){
//        int valor;
//        while(true){
//            String m=JOptionPane.showInputDialog(null,Otro);
//            try{
//                valor=Integer.parseInt(m);
//                break;
//            }catch(NumberFormatException e){
//                JOptionPane.showMessageDialog(null,"ERROR");
//            }
//        }
//        return valor;
//    }
//}
