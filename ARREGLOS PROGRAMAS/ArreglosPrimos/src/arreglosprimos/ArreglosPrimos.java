
package arreglosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author aw
 */
public class ArreglosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=2;
        int numero=0; //declaracion de variable numero de tipo entero
        int i=0,opcion;//declaracion de la constante i de tipo entero
        String opc;
        do{
            try{
                numero=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero"));//pide al usuario que introduzca un numero
                int []numerosprimos=new int[numero];
                for(int b=0;b<=numero;b++){//declaracion de la sentencia for
                    numerosprimos[b]=a;
                    a=a+1;
                    for(int c=1;c<b;c++){//declarando la senetncia for dentro del for
                        if(b%c==0){//declarando la sentencia if dentro del for
                            i=i+1;//realiza el incremento
                        }//fin de la sentencia if
                    }//fin de la segunda sentencia for
                    if(i<3){//
                        JOptionPane.showMessageDialog(null,b);//muestra el msj
                    }
                    i=0;
                }
            }catch(Exception d){
                JOptionPane.showMessageDialog(null,"Error Introduce un numero");
            }
            opc=JOptionPane.showInputDialog(null,"DESEA CONTINUAR s/n");
            opcion=opc.charAt(0);
        }while(numero==numero);
    }
}
