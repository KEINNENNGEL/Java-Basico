package Ordenar;
import java.util.*;
public class Ordenar {

    public static void main(String[] args) 
    {
        String[] proA = {"Esta", "es", "una", "coleccion", "es", "una"};
        String[] proB = {"Otra", "coleccion", "mas", "coleccion", "es"};

        //VER LOS ARRAYS COMO CADENAS
        System.out.println("Array A: " + Arrays.toString(proA));
        System.out.println("Array B: " + Arrays.toString(proB));
        System.out.println();

        //ARRAY PASADO A LISTA Y RECORRIDO CON ITERATOR
        System.out.println("RECORRER: ");
        List<String> la = new ArrayList(Arrays.asList(proA));        
        Iterator iter = la.iterator();
        while(iter.hasNext()) 
        {
            System.out.print(iter.next() + " ");
        }        
        System.out.println();
        System.out.println("Lista LA: " + la);
        
        //AÑADIMOS ELEMENTO A LISTA Y RECORREMOS
        System.out.println("AÑADIR: ");
        la.add("palabra");
        Iterator iter1 = la.iterator();
        while(iter1.hasNext()) 
        {
            System.out.print(iter1.next() + " ");
        }           
        System.out.println();
        System.out.println("Longitud de la Lista: " + la.size());
        
        //BORRAMOS UN ELEMENTO DE LA LISTA
        System.out.println("BORRAR: ");        
        la.remove(3);
        Iterator iter2 = la.iterator();
        while(iter2.hasNext()) 
        {
            System.out.print(iter2.next() + " ");
        }   
        System.out.println();
        System.out.println("Longitud de la Lista: " + la.size());
        
            
        
        //GENERAMOS TREE-SETS DE LOS ARRAYS DE STRINGS        
        Set<String> a = new TreeSet<>(Arrays.asList(proA));
        Set<String> b = new TreeSet<>(Arrays.asList(proB));

        System.out.println("\nCONJUNTOS:");
        System.out.println("Conjunto A: " + a);
        System.out.println("Conjunto B: " + b);
        
        //REALIZAMOS OPERACIONES SOBRE LOS 2 CONJUNTOS
        System.out.println("OPERACIONES: ");
        
        Set c = union(a, b);
        System.out.println("Union: " + c);
               
        c = interseccion(a, b);
        System.out.println("Interseccion: " + c);
        
        c = diferencia(a, b);               
        System.out.println("Diferencia: " + c);
               
        c = diferenciaSimetrica(a, b);
        System.out.println("Diferencia simética: " + c);

        System.out.println("OPERACIONES GENERICAS: ");
        
        Set<String> cGen = unionGen(a, b);
        System.out.println("UnionGen: " + cGen);
        
        cGen = interseccionGen(a, b);
        System.out.println("InterseccionGen: " + cGen);
        
        cGen = diferencia(a, b);
        System.out.println("DiferenciaGen: " + cGen);
        
        cGen = diferenciaSimetricaGen(a, b);
        System.out.println("Diferencia siméticaGen: " + cGen);
    }

    //METODOS GENERALES
    public static Set union(Set a, Set b) {
        Set res = new TreeSet(a);
        res.addAll(b);
        return res;
    }
    
    public static Set interseccion(Set a, Set b) {
        Set res = new TreeSet(a);
        res.retainAll(b);
        return res;
    }
    
    public static Set diferencia(Set a, Set b) {
        Set res = new TreeSet(a);
        res.removeAll(b);
        return res;
    }
    
    public static Set diferenciaSimetrica(Set a, Set b) {
        Set res = diferencia(a,b);
        Set bmenosa = diferencia(b,a);
        res.addAll(bmenosa);
        return res;
    }

    //METODOS GENERICOS
    public static <T> Set<T> unionGen(Set<T> a, Set<T> b) {
        Set<T> res = new TreeSet<>(a);
        res.addAll(b);
        return res;
    }
    
    public static <T> Set<T> interseccionGen(Set<T> a, Set<T> b) {
        Set<T> res = new TreeSet<>(a);
        res.retainAll(b);
        return res;
    }
    
    public static <T> Set<T> diferenciaGen(Set<T> a, Set<T> b) {
        Set<T> res = new TreeSet<>(a);
        res.removeAll(b);
        return res;
    }
    
    public static <T> Set<T> diferenciaSimetricaGen(Set<T> a, Set<T> b) {
        Set res = diferenciaGen(a,b);
        Set bmenosa = diferenciaGen(b,a);
        res.addAll(bmenosa);
        return res;
    }



}
