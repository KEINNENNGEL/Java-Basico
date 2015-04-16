import java.util.Random;


public class JuegoCanicas {
		private int puntajeTotal=0;
		private int Tiros=0;
		
		private int [][]tablero={
				{1,2,3,4,5,6},
				{2,3,4,5,6,1},
				{3,4,3,4,5,2},
				{4,5,3,4,5,3},
				{5,6,3,4,5,4},
				{6,1,3,4,5,5},
				{1,2,3,4,5,6}
		};
		private Premio[] premios;
		public JuegoCanicas(){
			iniciarJuego();
		}
		private void iniciarJuego(){
			
			Premio premio1 = new Premio("Oso de peluche", 10);
	        Premio premio2 = new Premio("Alcancia", 15);
	        Premio premio3 = new Premio("Globo de gas", 20);
	        Premio premio4 = new Premio("Pelota", 25);
	        Premio premio5 = new Premio("Pez", 5);
	        Premio premio6 = new Premio("Cuyo", 10);
	        Premio premio7 = new Premio("Juego de comida", 30);
			
	        premios = new Premio[7];
	        premios[0] = premio1;
	        premios[1] = premio2;
	        premios[2] = premio3;
	        premios[3] = premio4;
	        premios[4] = premio5;
	        premios[5] = premio6;
	        premios[6] = premio7;
		}
		/*simula el tiro de la canica*/
		public void tirarCanica(){
			if(Tiros<7){
			int PosicionFila=generarPosicionAleatorio(0, 5);
			int PosicionColumna=generarPosicionAleatorio(0, 5);
			int PuntajeTiro=tablero[PosicionFila][PosicionColumna];
			puntajeTotal=puntajeTotal+PuntajeTiro;
			Tiros=Tiros+1;
			}
			else{
				System.out.println("terminado");
			}
		}
		public void mostrarPremios(){
			for(int i=0;i<premios.length;i++){
				if(premios[i].getPuntaje()==puntajeTotal){
					System.out.println(premios[i].getDescripcion());
				}
			}
		}
		private int generarPosicionAleatorio(int inicio,int fin){
			//int numero=(int)(Math.random()/inicio*fin)+1;
			//return 0;
			Random aleatorio=new Random();
			return aleatorio.nextInt(6);
		}
	
}
