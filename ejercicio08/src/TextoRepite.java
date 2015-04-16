import javax.swing.JOptionPane;

/*8. Implementar un programa que lea un texto (como máximo de 100 caracteres), 
y que calcule cuál es la vocal que más se repite.  */
public class TextoRepite {
	
	public String validar(String texto){
		int tamaño=texto.length();
		if(tamaño<=100){
			for(int indice=0;indice<tamaño;indice++){
				texto=texto;
			}
		}else if(tamaño>100){
			System.out.println("Tamaño de caracteres sobrepasado");
			return "";
		}
		return texto;
	}
	public int[] vocales(String texto){
		int tamaño=texto.length();
		int arreglo[]=new int [5];
		int a=0,e=0,i=0,o=0,u=0;
		for(int indice=0;indice<tamaño;indice++){
			if(texto.charAt(indice)=='a'){
				a++;
			}
			if(texto.charAt(indice)=='e'){
				e++;
			}
			if(texto.charAt(indice)=='i'){
				i++;
			}
			if(texto.charAt(indice)=='o'){
				o++;
			}
			if(texto.charAt(indice)=='u'){
				u++;
			}
		}
		arreglo[0]=a;
		arreglo[1]=e;
		arreglo[2]=i;
		arreglo[3]=o;
		arreglo[4]=u;
		System.out.println("a "+a);
		System.out.println("e "+e);
		System.out.println("i "+i);
		System.out.println("o "+o);
		System.out.println("u "+u);
		return arreglo;
	}
}