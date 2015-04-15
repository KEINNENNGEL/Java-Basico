/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloburbujaordena;

/**
 *
 * @author aw
 */
import java.util.*;
public class ArregloBurbujaOrdena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random elemento = new Random();
        int numero[]= new int [10];
        int aux,j,i;
        System.out.print("\tNUMEROS ALEATORIOS\n");
        for(i=0;i<numero.length;i++){
            numero[i]=elemento.nextInt(11);
            System.out.print("\t  "+numero[i]+"\n");
        }
        for(i=0;i<=numero.length-2;i++){
            for(j=i+1;j<=numero.length-1;j++){
                if(numero[i]<numero[j]){
                    aux=numero[i];
                    numero[i]=numero[j];
                    numero[j]=aux;
                }
            }
    }System.out.print("\tDESCENDENTE\n");
            for(j=0;j<numero.length;j++){
            System.out.println("\t  "+numero[j]);
            }
            for(i=0;i<=numero.length-2;i++){
            for(j=i+1;j<=numero.length-1;j++){
                if(numero[i]>numero[j]){
                    aux=numero[i];
                    numero[i]=numero[j];
                    numero[j]=aux;
                }
            }
    }System.out.print("\tASCENDENTE\n");
            for(j=0;j<numero.length;j++){
            System.out.println("\t  "+numero[j]);
            }
            
        }
    }

