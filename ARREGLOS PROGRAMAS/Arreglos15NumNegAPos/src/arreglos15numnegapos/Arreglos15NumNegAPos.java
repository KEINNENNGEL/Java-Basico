/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos15numnegapos;

/**
 *
 * @author aw
 */import javax.swing.JOptionPane;
public class Arreglos15NumNegAPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero[]=new int [15];
        for(int i=0;i<numero.length;i++){
            numero[i]=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL NUMERO NEGATIVO "+(i+1)+" DE "+numero.length));
        }for(int i=0;i<numero.length;i++){
            JOptionPane.showMessageDialog(null,"CONVERTIDOS A POSITIVOS \nNUMERO NEGATIVO "+(numero[i])+" \nNUMERO POSITIVO "+(-(numero[i])));
        }
    }
}
