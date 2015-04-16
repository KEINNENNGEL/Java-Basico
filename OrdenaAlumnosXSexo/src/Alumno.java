import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;


public class Alumno {
	public int Matricula;
	public String Alumno;
	public String ApellidoP;
	public String ApellidoM;
	public String Sexo;
	
	public Alumno(int Matricula,String Alumno,String ApellidoP,String ApellidoM,String Sexo){
		this.Matricula=Matricula;
		this.Alumno=Alumno;
		this.ApellidoP=ApellidoP;
		this.ApellidoM=ApellidoM;
		this.Sexo=Sexo;
	}
	
}
class Manager{
	public static void alumno(Alumno x){
		
		Alumno nomb0=new Alumno(113693, "Miguel Angel", "Fuentes", "Ramirez", "M");
		Alumno nomb1=new Alumno(113693, "Miguel Angel", "Fuentes", "Ramirez", "M");
		Alumno nomb2=new Alumno(113693, "Miguel Angel", "Fuentes", "Ramirez", "M");
		Alumno nomb3=new Alumno(113693, "Miguel Angel", "Fuentes", "Ramirez", "M");
		Alumno nomb4=new Alumno(113693, "Miguel Angel", "Fuentes", "Ramirez", "M");
		Alumno nomb5=new Alumno(113693, "Miguel Angel", "Fuentes", "Ramirez", "M");
		Alumno nomb6=new Alumno(113693, "Miguel Angel", "Fuentes", "Ramirez", "M");
		
		Alumno nombres=new Alumno();
		String Alumno[]=new String[1];
		System.arraycopy(nombres, 0, Alumno, 0,);
		nombres.Matricula="113693";
		nombres.Alumno="Miguel Angel";
		nombres.ApellidoP="Fuentes";
		nombres.ApellidoM="Ramirez";
		nombres.Sexo="Masculino";
		Alumno[0]=nombres.toString();
		//
		
		
	}
	public int hombres(int i){
		i=0;
		this.Sexo="M";
		if(Sexo=="M"){
			i++;
		}
		return i;
	}
	public int mujeres(int i){
		i=0;
		if(Alumno=="F"){
			i++;
		}
		return i;
	}
	public int total(int x){
		x=hombres(7)+mujeres(9);
		System.out.println(" Total: "+x);
		return total();
	}
}
class Principal{
	public static void main(String []args){
		Manager al=new Manager();
		//instancia de la clase 
		al.total();
		}
	
}
