package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Teste"); //String
        conjunto.add(1); //int -> Integer
        conjunto.add('x'); //char -> Character

        System.out.println("O tamanho é " + conjunto.size());

        System.out.println(conjunto);

        System.out.println(conjunto.remove(1));

        System.out.println(conjunto.remove("teste"));

        System.out.println("O tamanho é " + conjunto.size());

        System.out.println(conjunto.contains(1.2));

        System.out.println(conjunto);

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        conjunto.addAll(nums); //(União entre dois conjuntos)
        System.out.println(conjunto);

        conjunto.retainAll(nums); //restringe entre os valores comuns entre os dois conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
