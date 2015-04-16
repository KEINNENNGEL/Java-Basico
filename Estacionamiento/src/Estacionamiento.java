import java.util.ArrayList;
public class Estacionamiento {

    private int disponibles;
    private final int max=5;
    private ArrayList arreglo = new ArrayList();
    private Object temporal;
    private String []autos= {
    		"QAZ",
    		"EDS",
    		"WSX",
    		"EDC",
    		"RFV"
    		};

    public int getDisponibles(){
        return disponibles;
    }

    public void No(){
                if(disponibles==0){
            System.out.println("Estacionamiento LLeno !!!");
        }
        else
            disponibles-=1;
            arreglo.add(max);

    }


     public ArrayList pop(){
        if(disponibles==5){
            System.out.println("Estacionamiento Vacio....!!!");
            return null;
        }
        else
        {
            disponibles+=1;
             temporal=arreglo.get(arreglo.size()-1);
            arreglo.remove(arreglo.size()-1);
            System.out.println("fbbfnbdfnbfbgf "+temporal);
            return (ArrayList) temporal;
        }
    }

      public ArrayList getArreglo() {
        return arreglo;
    }

    public void setArreglo(ArrayList arreglo) {
        this.arreglo = arreglo;
    }


public static void main(String []args){
	Estacionamiento nuevo=new Estacionamiento();
	nuevo.getArreglo();
	nuevo.getDisponibles();
	nuevo.pop();
	System.out.println(nuevo);
}
}




