/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sionoesprimo;

/**
 *
 * @author aw
 */
import javax.swing.JOptionPane;

public class SiOnoESprimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        int i=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE CUALQUIER NUMERO PARA SABER SI ES O NO PRIMO"));
        for(int numA=1;numA<=numero;numA++){
            for(int numN=0;numN<=numero;numN++){
                if(numN%numA==(2)){
                    i++;
                }
            }    
        }
        if(i<3){
            
           JOptionPane.showMessageDialog(null,"el numero es primo " + numero) ;            

        }
        
        else   {
            JOptionPane.showMessageDialog(null,"el numero no es primo "     + numero);
        }    
        }
        
            
        }
    
    

