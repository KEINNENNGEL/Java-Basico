/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo40alumcal.altabja;

/**
 *
 * @author aw
 */import javax.swing.JOptionPane;
public class Arreglo40AlumCalAltaBja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alumno[]=new int[4];
        int calificacion[]=new int [40];
        int mayor=calificacion[0],j,i;
        int menor=calificacion[0];
        for(i=0;i<alumno.length;i++){
            JOptionPane.showMessageDialog(null,"ALUMNO "+(i+1)+" DE "+alumno.length);
            for(j=0;j<1;j++){
                calificacion[j]=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA CALIFICACION "+(j+1)+" DEL ALUMNO "+(i+1)+" DE "+calificacion.length));
            }
        }
       for(j=0;j<1;j++){
            if(calificacion[j]>calificacion[j] && calificacion[j]>0)
                mayor=calificacion[j];
                JOptionPane.showMessageDialog(null,"CALIFICACCION MAYOR \n"+mayor+"\n");
            
           // mayor=calificacion[i];
            if(menor>calificacion[j])
                menor=calificacion[j];
                JOptionPane.showMessageDialog(null,"CALIFICACCION MENOR \n"+menor+"\n");
            
            //menor=calificacion[i];
        }
       //JOptionPane.showMessageDialog(null,"CALIFICACCION MAYOR \n"+Integer.toString(mayor)+"\n");
       //JOptionPane.showMessageDialog(null,"CALIFICACCION MENOR \n"+Integer.toString(menor)+"\n");
      }
}