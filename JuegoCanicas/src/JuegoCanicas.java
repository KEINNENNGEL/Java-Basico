import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class JuegoCanicas {
	int tomar;
	int puntaje;
	String premio;
	int canicas[][];
	int canicas2[][];
	//public JuegoCanicas(int tomar,int puntaje,String premio){
		//this.tomar=tomar;
		//this.puntaje=puntaje;
		//this.premio=premio;
		//}
	public int caja(int canicas[][]){
		Random elemento=new Random();
		canicas=new int [9][5];
		int i;
		int x=0;
		for(i=0;i<=canicas.length;i++){
			for(x=0;x<canicas[0].length;x++){
				canicas[i][x]=elemento.nextInt(7);
			}
		}
		canicas2=new int[9][5];
		
		for(i=0;i<=canicas2.length;i++){
			for( x=0;x<canicas2.length;x++){
				
			}
		}
		System.out.println(canicas[i][x]+"	*	");
		return canicas2[i][x];
	}
	public void tirar(){
		Random lanzamiento=new Random();
		int tomar=0;
		int a,b;
		Scanner tiro=new Scanner(System.in);
		
		int canicas[][]=new int[9][5];
		
		for(int i=0;i<=6;i++){
			//for(int x=0;x<canicas[0].length;x++){	
			System.out.println("Lanza la Canica");
			a=lanzamiento.nextInt();
			b=lanzamiento.nextInt();
			canicas2[a][b]=tomar;
			System.out.println(tomar);
			//}
		}
		tiro.close();
		
	}
	public void resultadoFinal(){
		int total=0;
		tomar++;
		total=tomar;
		//return total;
	}
	//public void obtenerPremios() {
		
	//}

}
class premio{
	String descripcion;
	int puntaje;
	public static void main(String[]args){
		JuegoCanicas hh=new JuegoCanicas();
		hh.tirar();
		hh.resultadoFinal();/*
		hh.resultadoFinal(total);*/
		JOptionPane.showInputDialog("ffhfhfh");
		
		
	}
}