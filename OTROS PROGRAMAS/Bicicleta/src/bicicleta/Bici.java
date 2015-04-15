/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author aw
 */
public class Bici {
    /*
    String color;
    String marca;
    int velocidades;
    int rodada;
    double peso;
    String frenos;
    boolean amortiguadores;
    double precio;
    */
 /* Bici(){
    color="rojo";
    marca="patito";
    velocidades=5;
    rodada=18;
    peso=16;
    frenos="goma";
    amortiguadores=true;
    precio=2000; 
    System.out.println(marca + color + precio + peso);
    }*/
    
    void frenar(){
        System.out.println("freno"); 
    }
    void pedalear(){
      System.out.println("pedalear");   
    }
    void cambiovelocidad(){
       System.out.println("cambio de velocidad");  
    }
    void andarsobre1rueda(){
      System.out.println("solo de una rueda");   
    }
    void girar(){
     System.out.println("giro");    
    }
    void reversa(){
     System.out.println("reversa");    
    }
    
}

class BiciBennotto extends Bici{
     BiciBennotto(){
//     color="azul";
//    marca="patito";
//    velocidades=5;
//    rodada=18;
//    peso=16;
//    frenos="goma";
//    amortiguadores=false;
//    precio=2000; 
//    System.out.println(color + marca + precio);
    }
  void volar(){
      System.out.println("vuelo");
  }  
  
  class Pato {
   
   String color;
    String marca;
    int velocidades;
    int rodada;
    double peso;
    String frenos;
    boolean amortiguadores;
    double precio;
   
    Pato(boolean amortiguadores){
    color="verde";
    marca="patito";
    velocidades=5;
    rodada=18;
    peso=16;
    frenos="goma";
    amortiguadores=false;
    precio=2000; 
    System.out.println(marca + color + precio + peso +frenos );
        
    }  
  }
}