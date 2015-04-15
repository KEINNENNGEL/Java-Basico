/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leertextos;

/**
 *
 * @author aw
 */
import java.io.*;
public class Texto {
    public void leerarchiv(String nombrearchivo){
        try{
        FileReader lectorarchivo =new FileReader (nombrearchivo);
        BufferedReader buffer =new BufferedReader(lectorarchivo);
        //System.out.println(buffer.readLine());
        String arreglo[]=new String[10];
        String lineas="";
        for(int i=0;i<10;i++){
            arreglo[i]=buffer.readLine();
        }
        for(int i=0;i<10;i++){
            System.out.println(arreglo[i]);
        }
//       // try{
//        while(lineas!=null){
//            lineas=buffer.readLine();
//            if(lineas!=null){
//                System.out.println(lineas);
//            }
//        }
//       // }catch(Exception h){
            
        }catch(IOException x){
    System.out.println(x.getMessage());
            
        } 
    }
}
    

