	/*7. Escribir un programa que lea un texto (como m�ximo de 100 caracteres), 
	y calcule de cu�ntas palabras est� compuesto. Supondremos que no se escriben
 	m�s de un espacio en blanco entre cada palabra. */
public class CuentaPalabras {
	
	public int conteo(String palabras){
		int tama�o=palabras.length();
		int numeroPalabras=1;
		if(tama�o<=100){
			for(int indice=0;indice<tama�o;indice++){
				if(palabras.charAt(indice)==' '){
					numeroPalabras++;
				}
			}
		}else if(tama�o>100){
			System.out.println("Tama�o de caracteres sobrepasado");
			return 0;
		}
		return numeroPalabras;
	}

}
