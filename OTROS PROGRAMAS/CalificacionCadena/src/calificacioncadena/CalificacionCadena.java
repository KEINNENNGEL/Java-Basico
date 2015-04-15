/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacioncadena;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class CalificacionCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion;
        String opc;
        int opcion;
        do{
            try{
                calificacion=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE TU CALIFICACION"));
                if(calificacion==0){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES CERO");
                }else if(calificacion==1){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES UNO");
                }else if(calificacion==2){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES DOS");
                }else if(calificacion==3){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES TRES");
                }else if(calificacion==4){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES CUATRO");
                }else if(calificacion==5){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES CINCO");
                }else if(calificacion==6){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES SEIS");
                }else if(calificacion==7){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES SIETE");
                }else if(calificacion==8){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES OCHO");
                }else if(calificacion==9){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES NUEVE");
                }else if(calificacion==10){
                    JOptionPane.showMessageDialog(null,"TU CALLIFICACION ES DIEZ");
                }
            }catch(Exception a){
                JOptionPane.showMessageDialog(null,"error te pedi un numero uno");
            }opc=JOptionPane.showInputDialog("DESEA CONTINUAR\n s = si\nn = no");
            opcion=opc.charAt(0);
        }while(opcion!='n');
    }
}
