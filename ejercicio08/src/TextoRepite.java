import javax.swing.JOptionPane;

/*8. Implementar un programa que lea un texto (como m�ximo de 100 caracteres), 
y que calcule cu�l es la vocal que m�s se repite.  */
public class TextoRepite {
	
	public String validar(String texto){
		int tama�o=texto.length();
		if(tama�o<=100){
			for(int indice=0;indice<tama�o;indice++){
				texto=texto;
			}
		}else if(tama�o>100){
			System.out.println("Tama�o de caracteres sobrepasado");
			return "";
		}
		return texto;
	}
	public int[] vocales(String texto){
		int tama�o=texto.length();
		int arreglo[]=new int [5];
		int a=0,e=0,i=0,o=0,u=0;
		for(int indice=0;indice<tama�o;indice++){
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