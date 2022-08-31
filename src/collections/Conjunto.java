package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        SortedSet<String>listaAprovados = new TreeSet<>();
        listaAprovados.add("Carlos");
        listaAprovados.add("Thais");
        listaAprovados.add("Sueli");
        listaAprovados.add("Ana");

        for (String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
