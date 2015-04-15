
package arreglos;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=1;//variable para almacenar los valores
        String [] nombres=new String[5];
        nombres[0]=" HOLA";
        nombres[1]=" SOY";
        nombres[2]=" Miguel Angel";
        nombres[3]=" ARREGLO";
        nombres[4]=JOptionPane.showInputDialog("introduce tu nombre");
       // nombres[5]="";
       JOptionPane.showMessageDialog(null,nombres[0]+nombres[1]+nombres[2]+nombres[3]+nombres[4]);
      // System.out.println(nombres[0]+nombres[1]+nombres[2]);
       
       int [] numeros=new int[100];//almacenar 100 numeros
       for(int i=0;i<100;i++){//almacenar valores de 1 a 100 dentro de nuestro arreglo
           numeros[i]=a;//agregar los numeros dentro del for
           a=a+1;//incremento de a
           if(numeros[i]%2==0)//verifica si el numero es par
           //System.out.println(numeros[i]);//
           JOptionPane.showMessageDialog(null,"los numeros pares son "+numeros[i]);
       }
    }
}
