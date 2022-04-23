package coleçoes;

import java.util.HashMap;
import java.util.Map;

public class mapa {
    public static void main(String [] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Roberta");
        usuarios.put(3, "Ricardo");
        usuarios.put(4, "Mario");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Mario"));
        System.out.println(usuarios.get(4));

        for ( int chave : usuarios.keySet()){
            System.out.println(chave);

        }
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }
        for( java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()){

            System.out.println(registro.getKey()+ " =>>");
            System.out.println(registro.getValue());

        }

        
    }
    
}
