
public class Palindromo {
	
	    public static boolean espalindromo(String entrada){
	        int length=entrada.length();
	        if(entrada.charAt(0)==entrada.charAt(length-1)){
	            String palabra=entrada.substring(1,(length-1));
	            if(palabra.length()==1){
	                return true;}
	                if(palabra.length()==0){
	                    return true;
	                }
	                espalindromo(palabra);
	                return true;
	            }
	            else{
	            return false;
	            }
	        }
}
