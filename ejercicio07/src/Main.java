
public class Main {
	public static void main(String[] args){
		String texto = "este es un programas que cuenta cuantas palabras " +
				"tiene y que no debe de sobrepsar a un ";
		CuentaPalabras o=new CuentaPalabras();
		int totalPalabras=o.conteo(texto);
		
		if(totalPalabras!=0){
			System.out.println("Total de Palabras: "+totalPalabras);
		}
		System.out.println("Total de Caracteres: "+texto.length());
	}
}
