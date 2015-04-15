/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package holamundo;

/**
 *
 * @author 103325
 */

import java.io.*; //importando java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         // TODO code application logic here
        String nombre ;// variable de tipo string
        int edad;// variable de tipo entero 
       System.out.println("hola mundo de Java :P "); // muestra el la pantalla hola mundo de java
       BufferedReader Leer = new BufferedReader(new InputStreamReader(System.in));//
       System.out.println("!TECLEA TU NOMBRE");//imprime y pide al usuario que introduzac su nombre
       nombre = Leer.readLine();//lee el nombre y la guarda en la variable nombre
       System.out.println("escribe tu edad");//pide al usuario la edad 
       edad = Integer.parseInt(Leer.readLine());//almacena la variable de tipo entero en edad
       System.out.println("hola " + nombre + " tu edad es de " + edad);//muestra al usuario el nombre y la edad
       // para realizar un comentario
       /* -----
        * --------
        * realizar lineas de comentarios
        */

       if (edad>=18){ // condicon if declaracion de la sentencia if si la edad es mayor o igual entonces mostrara al usuario el siguiente msj
           System.out.println("HOLA " + nombre + " YA ERES MAYOR DE EDAD");//mostrara el msj
       }//cierre del if
 else {//si no entonces mostrara el msj siguiente
          System.out.println("HOLA " + nombre+ "AUN ESTAS MUY PEQUEÑO");// muestra el msj
 }//cierre de else
       





    }

}
