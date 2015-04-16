package Recursividad;

public class Factorial {
	
	int operacion(int n) throws Exception{
		if(n>0){
			return n*operacion(n-1);
			}
		else{
			return 1;
		}
	}
	public static void main(String[]args) throws Exception{
		Factorial fac=new Factorial();
		int i=fac.operacion(3);
		System.out.println(i);
		System.out.println(3*2*1);
	}
	int factoriall(int n){
		int i;
		for(i=1;i>0;i--){
			i=i*n;
		}
		return i;
	}

}
