public class Main {
	public static void main(){
		JuegoCanicas maquina=new JuegoCanicas();
		for(int tiro=1;tiro<=6;tiro++){
			maquina.tirarCanica();
		}
		maquina.mostrarPremios();
	}
	

}



