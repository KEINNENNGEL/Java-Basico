package Cajero;

import java.io.File;
import java.util.Scanner;

public class Cajero {
	private Banco ban;
	private int numctas=0;
	
	public Cajero(String nomban,String lista){
		ban =new Banco(nomban);
		if(cargaCuenta(lista)>0){
			atiende();
		}
	}
	private int cargaCuenta(String lis){
		int res=-1;
		String lin;
		Scanner lee;
		String id;
		int sald;
		Cuenta cuent;
		
		try{
			File lect=new File(lis);
			lee=new Scanner(lect);
			while(lee.hasNext()){
				sald=lee.nextInt();
				cuent=ban.nuevaCuenta(sald);
				numctas++;
				System.out.println("Cuenta "+numctas+"con ID "+cuent.getIdentificador()+"Tiene "+cuent.getSaldo());
			}
		}catch(Exception x){
			System.out.println("Error al abiri "+x);
		}
		res=numctas;
		return res;
	}
	private void atiende(){
		Scanner conso=new Scanner(System.in);
		String opera,ayuda,id;
		int cant;
		Cuenta cuent;
		ayuda="Operaciones: Deposita, Retira, Ayuda, Fin";
		System.out.println("");
		System.out.println("Cajero Listo");
		System.out.println(ayuda+"\n");
		
		while(true){
			opera=conso.next();
			if(opera.equals("Fin")){
				System.out.println("Cajero Cerrando");
				break;
			}
			if(opera.equals("Ayuda"))
				System.out.println(ayuda+"\n");
				else{
					id=conso.next();
					cant=conso.nextInt();
					System.out.println("Leido "+opera+","+id+","+cant);
					if(opera.equals("Deposita")){
						cuent=ban.buscaCuenta(id);
						cuent.deposita(cant);
						System.out.println("Cuenta "+id+"Nuevo saldo $"+cuent.getSaldo());
					}else if(opera.equals("Retira")){
						cuent=ban.buscaCuenta(id);
						System.out.println("cuenta "+id+"Retira"+cuent.retira(cant)+"Quedando Saldo= $"+cuent.getSaldo());
					}else{
						System.out.println("Instruccion Desconocida");
					}
				}
			
		}
	}
	public static void main(String []args){
		Cajero  atm=new Cajero("Banco UTVM", "Clientes.txt");
	}
}
