package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("Sherlock Romes");
        livros.push("Java para Leigos");
        livros.push("Chainsaw Man");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop());
    }
}
