/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package horaminutoseguundo;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class HoraMinutoSeguundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mas=1,hora=0,minuto=0,segundo=0;
        do{
            try{
                hora=Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora "));
                minuto=Integer.parseInt(JOptionPane.showInputDialog("Introduce el minuto"));
                segundo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo "));
                if (segundo>=59 && minuto>=59){
                    hora+=+mas;
                    segundo=00;
                    if (hora>24){
                        hora=hora-24;
                    }
                    minuto=00;
                    JOptionPane.showMessageDialog(null,"El Hora es \n"+hora +":" + minuto+":" + segundo);
                }else if(segundo<59 && minuto<59){
                    int resultado=segundo+1;
                    JOptionPane.showMessageDialog(null,"El Hora es \n"+hora +":" + minuto+":" + resultado);
                }else if(segundo>=59){
                    minuto+=+mas;
                    segundo=00;
                    JOptionPane.showMessageDialog(null,"El Hora es \n"+hora +":" + minuto+":" + segundo);
                }
            }catch(Exception k){
                JOptionPane.showMessageDialog(null,"ERROR INTENTA OTRA VEZ");
            }
        }while(hora==0 && minuto==0 && segundo==0);   
    }
}
