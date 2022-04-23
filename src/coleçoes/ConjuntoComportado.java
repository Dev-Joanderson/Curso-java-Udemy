package coleçoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class ConjuntoComportado {
   
    public static void main(String [] argas) {
        
        //Set<String> lista = new HashSet<String>();
        Set <String> lista = new TreeSet<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("luca");
        lista.add("Pedro");
        
        for(String cadidato: lista){
            System.out.println(cadidato);
        }

        Set <Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(120);
        nums.add(6);

        for(int n: nums){
            System.out.println(n);
        }


        
    }
    
}
