/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author aw
 */import javax.swing.JOptionPane;
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[]=new int [5];
        int sum1=0;
        int prom=0;
        int i=0;
        int may=0,men=0;
        int contador=0,contador1=0,contador3=0;
        for ( i =0;i<arreglo.length;i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA CALIFICACION"));
            sum1=sum1+arreglo[i];
            if(arreglo[i]>may){
                may=arreglo[i];
            }if(arreglo[i]<men){
                men=arreglo[i];
            }
            System.out.println("LAS NOTAS INTRODUCIDAS SON "+ arreglo[i]);
        }
        prom=sum1/5;
        for ( i =0;i<5;i++){
            if (arreglo[i]>=prom){
                contador=contador+1;
            }
        }
        for( i=0;i<5;i++){
            if( arreglo[i]>5){
                contador1=contador1+1;
            }
            if (arreglo[i]<5){
                contador3=contador3+1;
            }
}
        System.out.println("REPROBADOS "+ contador3);
        System.out.println("APROBADOS "+contador1);
        System.out.println("PROMEDIO DE LAS NOTAS "+ prom);
        System.out.println("NOTA MAS ALTA: "+ may);
        System.out.println("NOTA MAS BAJA: "+ men);



     
    }
}
