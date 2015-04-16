import java.util.Scanner;


public class conteo {
	
	public static void main(String []args){
		Scanner datos=new Scanner(System.in);
		double billetes[]={1000,500,200,100,50,20,10,5,2,1,.50,.10};
		int almacen[]=new int[12];
		double cantidad=0.0;
		int z=0;
		int x;
		int i;
		System.out.println("introduce la cantidad de billetes");
		cantidad=datos.nextDouble();
		
		for(x=0;cantidad>0;x++){
			for(i=0;cantidad>=billetes[z];i++){
				cantidad=cantidad-=billetes[z];
				almacen[z]++;
				}
			if(almacen[x]>0){
				System.out.println("Billete"+"		"+"Cantidad");
				System.out.println(billetes[z]+"	" +"	" +almacen[z]);
				}
			z++;
			}
		datos.close();
		}
	}
