/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo3x3;

/**
 *
 * @author aw
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
public class Arreglo3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader leer=new BufferedReader(in);
        int [][] arreglo3x3=new int [3][3];
        String [][] lista=new String [3][3];
        int opc=0,i=0,j=0;
//        try{
            do{
                try{
        System.out.println("QUE OPERACION DESEA REALIZAR:\n1.- INSERTAR\n2.- BUSCAR\n3.- ELIMINAR\n4.- MOSTRAR\n5.- SALIR");
        opc=Integer.parseInt(leer.readLine());
//        if(opc==1){
        switch(opc){
            case 1:
        for(i=0;i<lista.length;i++){
            for(j=0;j<lista[0].length;j++){
                System.out.println("Introduce los valores");
                lista[i][j]=leer.readLine();
                arreglo3x3[i][j]=Integer.parseInt(lista[i][j]);
                //lista[i][j]=JOptionPane.showInputDialog("Introduce los valores");
                //arreglo3x3[i][j]=Integer.parseInt(lista[i][j]);
                //arreglo3x3[i][j]=Integer.parseInt(lista[i][j]);
            }
        } 
        for(i=0;i<arreglo3x3.length;i++){
            
            for(j=0;j<arreglo3x3.length;j++){
               //System.out.println("Elemento [" +i+","+j+" ] =" +arreglo3x3[i][j]+" \n");
            }
        } 
                break;
        case 2:
           System.out.println("INTRODUCE UN NUMERO DE 0 A 2");
           int num=Integer.parseInt(leer.readLine());
           System.out.println("INTRODUCE UN NUMERO DE 0 A 2");
           int num2=Integer.parseInt(leer.readLine());
           System.out.println("LA POSICION "+num+" , "+num2+" es "+arreglo3x3[num][num2]+" \n");
         break;
        case 3:
            arreglo3x3[i][j]=arreglo3x3[0][0];
            break;
        case 4:
            for(i=0;i<arreglo3x3.length;i++){
            
            for(j=0;j<arreglo3x3.length;j++){
               System.out.println("Elemento [" +i+","+j+" ] =" +arreglo3x3[i][j]+" \n");
            }
        }
            break;
        case 5:
            System.out.println("usted a decido salir");
            break;
        }
          }catch(Exception x){
            System.out.print(x.getMessage());
        }   
        }while(opc!=5);
    }
}
