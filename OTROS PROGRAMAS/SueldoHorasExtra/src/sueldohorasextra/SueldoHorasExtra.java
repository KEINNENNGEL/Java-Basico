/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldohorasextra;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class SueldoHorasExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double resultado;
       // double sino=0;
        double otro=0;
        int horas=0,pago=0;
        do{
            try{
                horas=Integer.parseInt(JOptionPane.showInputDialog("introduce las horas trabajadas"));
                pago=Integer.parseInt(JOptionPane.showInputDialog("introduce el pago por hora"));
                if (horas>40){
                    double horasextra=horas-40;
                    double hor=horasextra-8;
                if (horasextra>8){
                    resultado=(40*pago)+(8*(pago*2))+(hor*(pago*3));
                    JOptionPane.showMessageDialog(null,"EL PAGO EXTRA CON MAS DE 8 HORAS EXTRA "+ resultado);
                }
                }
                if (horas<40){
                    otro=horas*pago;
                    JOptionPane.showMessageDialog(null,"tu sueldo :) " + otro);
                }
            }catch(Exception b){
                JOptionPane.showMessageDialog(null,"ERROR EN LA ESCRITURA INTENLO DE NUEVO");
            } 
        }while(horas==0&&pago==0);
    }
}
