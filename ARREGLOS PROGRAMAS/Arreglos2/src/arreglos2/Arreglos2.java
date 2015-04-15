
package arreglos2;

/**
 *
 * @author aw
 */
//import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Arreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader leer=new BufferedReader(in);
        String nombres[] =new String[1];
        String apellidospat[]=new String[1];
        String apellidosmat[]=new String[1];
        int indice=0;
        do{
            try{
                System.out.println("QUE DESEA HACER \n1.-INSERTAR \n2.-VER \n3.-SALIR");
                opc=Integer.parseInt(leer.readLine());
                switch(opc){
                    case 1:
                        System.out.println("INTRODUCE EL NOMBRE");
                        nombres[indice]=leer.readLine();
                        System.out.println("INTRODUCE EL APELLIDO PATERNO");
                        apellidospat[indice]=leer.readLine();
                        System.out.println("INTRODUCE EL APELIIDO METERNO");
                        apellidosmat[indice]=leer.readLine();
                        indice++;
                        break;
                    case 2:
                        for(int i=0;i<=nombres.length;i++){//NOMBRE.lenght(indice)
                            if(nombres[i]!=null){
                                System.out.println(nombres[i]+apellidospat[i]+apellidosmat[i]);
                            }
                        }
                       break;
                    case 3:
                       System.out.println("USTED A DESEADO SALIR DEL PROGRAMA");
                        break;
                }
            }catch(Exception y){
                System.out.println("ERROR");
            }
        }while(opc!=3);
    }
}
//
//int [][]nombre=new int [4][4];
//for(i<4)
//for(j<4)
//if(j==i){
//nombres[i][j]=1;
//}
//
//else{
//nombres[i][j]=0;
//
//
//
///