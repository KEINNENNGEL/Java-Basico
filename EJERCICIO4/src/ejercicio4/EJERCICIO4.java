/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author aw
 */import java.util.*;
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               //utilizamos el random y declaramos el arreglo
        Random numeros=new Random();
        int arreglo[]=new int [100];
        int suma=0,num2=0,num3=0;
        int contador=0;
        
        for (int i=0;i<100;i++){
            arreglo[i]=numeros.nextInt(100);
            if(arreglo[i]%2==0){
                suma+=arreglo[i];
                 num2++;
            }
            else if (arreglo[i]%2!=0){
                num3+=arreglo[i];
                contador++;
            }
      }
        for(int i=0;i<100;i++){
            System.out.println("LOS VALORES DEL ARREGLO: "+arreglo[i]);
        }
        System.out.println("PROMEDIO DE LPOS PARES "+(double)suma/num2);
        System.out.println("PROMEDIO DE LOS IMPARES "+(double)num3/contador);
        System.out.println("SUMA DE PARES "+suma);
        System.out.println("SUMA DE IMPARES" +num3);
                   
    }
}
