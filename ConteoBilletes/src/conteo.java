import java.util.Scanner;


public class conteo {
	
	public static void main(String[]args){
		Scanner lector=new Scanner(System.in);
		double cantidad;
		double NBilletes;
		double NB[]={1000,500,200,100,50,20,10,5,2,1,.50,.10};
		System.out.println("Ingrese la cantidad");
		cantidad=lector.nextDouble();
		
		if(cantidad>=NB[0]){//billetes de 1000
			NBilletes=cantidad/NB[0];
			System.out.println("Billete(s) de 1000 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[0];
		}
		if(cantidad>=NB[1]){//billetes de 500
			NBilletes=cantidad/NB[1];
			System.out.println("Billete(s) de 500 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[1];
		}
		if(cantidad>=NB[2]){//billetes de 200
			NBilletes=cantidad/NB[2];
			System.out.println("Billete(s) de 200 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[2];
		}
		if(cantidad>=NB[3]){//billetes de 100
			NBilletes=cantidad/NB[3];
			System.out.println("Billete(s) de 100 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[3];
		}	
		if(cantidad>=NB[4]){//billetes de 50
			NBilletes=cantidad/NB[4];
			System.out.println("Billete(s) de 50 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[4];
		}
		if(cantidad>=NB[5]){//billetes de 20
			NBilletes=cantidad/NB[5];
			System.out.println("Billete(s) de 20 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[5];
		}
		if(cantidad>=NB[6]){//billetes de 10
			NBilletes=cantidad/NB[6];
			System.out.println("Billete(s) de 10 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[6];
		}
		if(cantidad>=NB[7]){//billetes de 5
			NBilletes=cantidad/NB[7];
			System.out.println("Billete(s) de 5  -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[7];
		}
		if(cantidad>=NB[8]){//billetes de 2
			NBilletes=cantidad/NB[8];
			System.out.println("Billete(s) de 2  -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[8];
		}
		if(cantidad>=NB[9]){//billetes de 1
			NBilletes=cantidad/NB[9];
			System.out.println("Billete(s) de 1 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[9];
		}
		if(cantidad>=NB[10]){//billetes de .50
			NBilletes=cantidad/NB[10];
			System.out.println("Billete(s) de .50 -->"+Math.floor(NBilletes));
			cantidad=cantidad%NB[10];
		}
		if(cantidad>=NB[11]){//billetes de .10
			NBilletes=cantidad/NB[11];
			System.out.println("Billete(s) de .10 -->"+NBilletes);
			cantidad=cantidad%NB[11];
		}
		//for(int i=0;i<=NB.length;i++){
			//System.out.println("");
		//}
		lector.close();
	}

}
