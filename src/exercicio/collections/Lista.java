package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Thais"));
        lista.add(new Usuario("Sueli"));
        lista.add(new Usuario("Vitoria"));
        lista.add(new Usuario("Josinaldo"));

        System.out.println(lista.get(1));

        lista.remove(3);
        lista.remove(new Usuario("Manau"));

        System.out.println("Tem? " + lista.contains(new Usuario("Thais")));

        for(Usuario u: lista) {
            System.out.println(u.nome);
        }
    }
}
