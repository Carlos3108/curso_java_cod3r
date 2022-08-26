package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Diferentes comportamentos quando a fila está cheia
        fila.add("Ana"); //retorna um false
        fila.offer("Bia"); //retorna uma exceção
        fila.add("Carlos");
        fila.offer("Rafaela");
        fila.add("Thais");
        fila.offer("Vitoria");

        //Diferentes comportamentos quando a fila está vazia
        System.out.println(fila.peek()); //retorna null
        System.out.println(fila.element()); //retorna uma exceção

        System.out.println(fila.poll()); //Obtem o próximo elemento da fila e o revome.
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        /*
        fila.size();
        fila.clear();
        fila.isEmpty();
        fila.contains("");
        */
    }
}
