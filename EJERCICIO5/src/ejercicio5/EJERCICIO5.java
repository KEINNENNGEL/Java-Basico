/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author aw
 */import javax.swing.JOptionPane;
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[]=new int[5];
        int arregloA[]=new int[5];
        int arregloB[]=new int[5];
        int a=0,b=0,c=0;
        int suma=0,suma2=0,suma3=0;
        int mayor=0;
        int mayor2=0;

        for(int i=0;i<5;i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LOS VALORES DEL 1ER VECTOR"));
            suma+=arreglo[i];
            a++;
            if(arreglo[i]>0){
                mayor=arreglo[i];
            }
        }
        for(int j=0;j<5;j++){
            arregloA[j]=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LOS VALORES DEL 2DO VECTOR"));
            suma2+=arregloA[j];
            b++;
            if(arregloA[j]>0){
                mayor2=arregloA[j];
            }
        }
        arregloB[0]=(arreglo[0]+arregloA[0]);
        arregloB[1]=(arreglo[1]+arregloA[1]);
        arregloB[2]=(arreglo[2]+arregloA[2]);
        arregloB[3]=(arreglo[3]+arregloA[3]);
        arregloB[4]=(arreglo[4]+arregloA[4]);
        System.out.println("PROMEDIO VECTOR 1 -- " +suma/a);
        System.out.println("VECTOR 1 MAYOR -- " +mayor);
        System.out.println("PROMEDIO VECTOR 2 -- " +suma2/b);
        System.out.println("VECTOR 2 MAYOR -- "+mayor2);
        System.out.println("VALORES DEL VECTOR 3 OBTENIDO EN LA SUMA DEL VECTOR 1 Y 2" );
        System.out.println(arregloB[0]);
        System.out.println(arregloB[1]);
        System.out.println(arregloB[2]);
        System.out.println(arregloB[3]);
        System.out.println(arregloB[4]);
        }




    }



    
