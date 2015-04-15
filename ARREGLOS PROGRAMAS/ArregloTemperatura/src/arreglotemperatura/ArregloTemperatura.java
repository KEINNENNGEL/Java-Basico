/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglotemperatura;

/**
 *
 * @author aw
 */
import java.util.*;
public class ArregloTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random elemento=new Random();
        int temperatura[]=new int [24];
        int dia[]=new int[7];
        int i,j=0;
        double mas=0,promdia;
        for(i=0;i<dia.length;i++){
            System.out.println("DIA" +(i+1));
            for(j=0;j<temperatura.length;j++){
                temperatura[j]=elemento.nextInt(40);
                System.out.println(" TEMPERATURA \t"+temperatura[j]);
                mas=mas+temperatura[j];
            }
            promdia=(mas/24);
            i++;
            System.out.println(">> "+mas+" PROMEDIO POR DIA "+promdia);
            
            
        }
    }
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */