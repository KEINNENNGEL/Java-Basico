import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Auto {
	private String color;
	private String marca;
	private String numeroPlaca;
	public static void main(String[] args) {



	       List<String> listaDeCadenas = new ArrayList<String>();
	       
	//agregando autos
	       		listaDeCadenas.add("Auto 1"+" Lugar Ocupado");
	                listaDeCadenas.add("Auto 2"+" Lugar Ocupado");
	                listaDeCadenas.add("Auto 3"+" Lugar Ocupado");
	                listaDeCadenas.add("Auto 4"+" Lugar Ocupado");
	                listaDeCadenas.add("Auto 5"+" Lugar Ocupado");

	            int numeroElementos = listaDeCadenas.size();

	            System.out.println("\n Lugares Ocupados: "+numeroElementos);
	            System.out.println(listaDeCadenas + " \n Estacionamineto Lleno !! \n");
	            

	//quitando autos
	            listaDeCadenas.remove(0);
	            System.out.println(listaDeCadenas + " Lugar Vacio\n");

	            listaDeCadenas.remove(1);
	            System.out.println(listaDeCadenas + " Lugar Vacio\n");

	            listaDeCadenas.remove(2);
	            System.out.println(listaDeCadenas + " Lugar Vacio\n");


	           boolean estaVaciaLaLista = listaDeCadenas.isEmpty();

	//agregando autos
	    		listaDeCadenas.add(0, "Auto 6"+" estacionado");
	                listaDeCadenas.add(1, "Auto 7"+" estacionado");
	                listaDeCadenas.add(2, "Auto 8"+" estacionado");

	  System.out.println(listaDeCadenas);


	           }


}
