
public class Ocurrencias {
	public void concurrencia(String cadena){
        //int contador = 0;
        String cantidad = "";
        String aux = "";
 
        for (int i=0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ')
                aux += cadena.charAt(i);
        }      
        int cuenta[] = new int[aux.length()];
 
        for(int i=0; i<aux.length(); i++)
            cuenta[i]=0;
 
        int k=0;
        for(int i=0; i<aux.length(); i++){
            for(int j=i+1; j<aux.length(); j++){
                if(aux.charAt(i) == aux.charAt(j)){
                    cuenta[aux.indexOf(aux.charAt(i))]++;
                }
            }
        }
        System.out.println("resultados");
        for(int i=0; i<aux.length(); i++){
            cantidad += aux.charAt(i) + "\t" + cuenta[i] + "\n";
        }
        System.out.println(cantidad);
	}
}
