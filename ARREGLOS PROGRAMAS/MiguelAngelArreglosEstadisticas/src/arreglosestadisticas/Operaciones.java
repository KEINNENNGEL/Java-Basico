/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosestadisticas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class Operaciones {
    Random elemento=new Random();
    
    void media(){
        int estadistica[]=new int [40];
        int m=0;
        int moda=0;
        int j;
        double total=0,mediana=0;
        for( j=0;j<estadistica.length;j++){
            estadistica[j]=elemento.nextInt(10);//alamcenando en nuestro array posicin j valores de 0 a 9
            total+=estadistica[j];//sumaqndo los valores de nuestro array para sacar la media
            //System.out.print("\t"+estadistica[j]);
        }
        System.out.println("\tMEDIA \n\t"+total/40+"\n");//impresion de la media
        for ( j=0;j<=estadistica.length-2;j++){///////////////un for donde tenemos almacena nuetros valor del array 
            for (m=j+1;m<=estadistica.length-1;m++){//////////un for para poder ordenar los valores
                if (estadistica[j]<estadistica[m]){////////////VALORES CO AYUDA DE UNA NUEVA DECLARACION DE UN FOR
                    int aux= estadistica[j];//////////////////nueva declaracion aux que es igual a estadisticas en la posicion j
                    estadistica[j]=estadistica[m];////////////igualando estadistica posicion j con estadistica posicion m
                    estadistica[m]=aux;///////////////////////estadistica es igual a aux
                    mediana=estadistica[19]+estadistica[20];//suma de los dos numeros que se encuentran  en la media de los numeros para poder obtener la media
                }
            }
            }
        int frecuencia[] = new int[ 10 ];//nuevo array para sacar la frecuencia
        int NumModa=0;//nueva declaracion donde almacenaremos la moda
        String salida="";///declaracion de un string para realizar las impreseiones;
        for(int indice1=0;indice1<estadistica.length;indice1++)//////////////////////////////////////////////////////////////////////////////////////
            ++frecuencia[estadistica[indice1]];
            salida+="\tLA FRECUANCIA:\n\tVALOR \t"+"FRECUENCIA\n";
            for(int indice2=0;indice2<frecuencia.length;indice2++){//////////////////////////////////////////////////////////////////////////////////////
                salida+="\n    \t"+indice2+"\t    "+frecuencia[indice2];//imprimiendo los valores de o a 9 y su frecuencia
                if(frecuencia[indice2]>frecuencia[NumModa])//iniciando un if para realizar la compraracion de el numero que se repite mas veces
                NumModa=indice2;//si la frecuencia es mayor a cero entonces moda es igual al indice 2
            }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println(salida);//imprimiendo los valores de la frecuencia
            System.out.println("\tMODA\n\t"+NumModa +"\t");//imprimiendo la moda
            for(m=0;m<estadistica.length;m++){//declarando en for para mostrar los valores que contiene//no se incluye en el codigo original solo es para visualizar que esten ordenados
            System.out.println("\t"+" :) "+ estadistica[m]+" jejejeje");//imprimiendo los valores ordenados de mayor a menor
            }
        //System.out.print("moda  "+moda);
        //System.out.println(" \n"+estadistica[19]+"\t"+estadistica[20]);
            System.out.println("\n\tMEDIANA\n\t"+ mediana/2);
    }
}
