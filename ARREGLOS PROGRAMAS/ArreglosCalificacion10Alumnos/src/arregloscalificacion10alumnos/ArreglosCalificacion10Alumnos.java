/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloscalificacion10alumnos;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class ArreglosCalificacion10Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double res=0,promedio;
        int calificaciones[]=new int [7];
        int alumnos[]=new int [10];
        do{
            try{
                for(int i=0;i<alumnos.length;i++){
                    JOptionPane.showMessageDialog(null,"ALUMNO "+(i+1)+" DE "+alumnos.length);
                    for(int j=0;j<calificaciones.length;j++){
                        calificaciones[j]=Integer.parseInt(JOptionPane.showInputDialog(null,"CALIFICACION "+(j+1)+ " DE "+calificaciones.length));
                        res=res+calificaciones[j];
                    }
                    promedio=res/calificaciones.length;
                    JOptionPane.showMessageDialog(null,"PROMEDIO DEL ALUMNO \n" + promedio);
                }
            }catch(Exception y){
                JOptionPane.showMessageDialog(null,"ERROR DE SINTAXIS");
            }
        }while(alumnos[10]!=alumnos[10]);
    }
}
