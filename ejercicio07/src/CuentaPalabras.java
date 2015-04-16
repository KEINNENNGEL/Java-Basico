	/*7. Escribir un programa que lea un texto (como máximo de 100 caracteres), 
	y calcule de cuántas palabras está compuesto. Supondremos que no se escriben
 	más de un espacio en blanco entre cada palabra. */
public class CuentaPalabras {
	
	public int conteo(String palabras){
		int tamaño=palabras.length();
		int numeroPalabras=1;
		if(tamaño<=100){
			for(int indice=0;indice<tamaño;indice++){
				if(palabras.charAt(indice)==' '){
					numeroPalabras++;
				}
			}
		}else if(tamaño>100){
			System.out.println("Tamaño de caracteres sobrepasado");
			return 0;
		}
		return numeroPalabras;
	}

}
