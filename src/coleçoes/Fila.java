package coleçoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String [] args) {
        
        Queue<String> fila = new LinkedList<>();
        // Offer e add -> adinam elementos na fila
        // Diferença é o comportamento quando a fila esta cheia

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //peak e Element -> obter o próximo elementos da fila (sem remover)
        // Diferença é o comportamento ocorre
        // quando a fila esta vazia!

        System.out.println(fila); // return false
        System.out.println(fila.peek());
        System.out.println(fila.element()); // laça um axceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        
    }
    
}
