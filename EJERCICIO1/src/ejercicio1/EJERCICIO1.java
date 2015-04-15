/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author aw
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3,num4,num5,num6;
        int [] a = {3,5,6,8,4,7,8,5,3,1};
        int [] b = {3,4,6,8,9,1,2,3,0,9};
        
        num1 = (a[3]%b[2])/2;
        num2 = b[a[1]]-a[9] ;
        num3 = a[1]+a[1+2];
        num4 = a[5]+b[5];
        num5 = (a[3]/b[2])/2;
        num6 = b[a[9]]+ b[1];
        
        System.out.println("OPERACION 1 " + num1);
        System.out.println("OPERACION 2 " + num2);
        System.out.println("OPERACION 3 " + num3);
        System.out.println("OPERACION 4 " + num4);
        System.out.println("OPERACION 5 " + num5);
        System.out.println("OPERACION 6 " + num6);

        
    }

}
