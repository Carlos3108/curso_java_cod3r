package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Henrique"));
        usuarios.add(new Usuario("Matheus"));
        usuarios.add(new Usuario("Gabriel"));

        boolean resultado = usuarios.contains(new Usuario("Gabriel"));
        System.out.println(resultado);
    }
}
