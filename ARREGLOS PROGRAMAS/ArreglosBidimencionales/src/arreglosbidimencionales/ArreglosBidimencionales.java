/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosbidimencionales;

/**
 *
 * @author aw
 */
public class ArreglosBidimencionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]arreglosBid=new int[4][4];
        
        for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(j==i){
                arreglosBid[i][j]=1;
            }
            else
                arreglosBid[i][j]=0;
        }
        }
        for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
          System.out.print(arreglosBid[i][j]+"\t");
        }
        System.out.print("\n");
        }
    }
}