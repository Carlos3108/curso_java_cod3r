package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Carlos");
        usuarios.put(2, "Thais");
        usuarios.put(3, "Sueli");
        usuarios.put(4, "Vitoria");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Carlos"));
        System.out.println(usuarios.get(1));
        System.out.println(usuarios.remove(1) + " Removido ");
        System.out.println(usuarios.remove(4, "Thais"));

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }
    }
}
