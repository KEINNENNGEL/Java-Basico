
public class Persona {
	
	String n;
	String am;
	String ap;
	
	void comer(){
		
	}
	void irAlBanio(){

	}
	Persona(){
		
	}
	Persona(String nombre){
		this.n=nombre;
	} 
	public String toString(){
		return n;
	}
	public static void main(String []args){
		System.out.println(new Persona());
		new Persona();
		new Persona("fvfebhenrtjntrjmymkyt");
		Persona p=null;
		p=new Persona();
		System.out.println(p);
		Persona[] ps={p};
		System.out.println(ps);
		System.out.println(ps[0]);
		
		ps=new Persona[2];
		System.out.println(ps.length);
		ps[0]=new Persona("Migue");
		ps[1]=new Persona("Miguel");
		//System.out.print(ps[2]);//no sirve
		//ps[0]="Miguel Angel FuENTES rAmirez";//no sirve 
		for(int i=0;i<=ps.length;i++){
			System.out.println(ps[i]);
		}
		System.out.println((ps[0]).n);
		System.out.println(" "+(ps[0]).comer());
	}
}

