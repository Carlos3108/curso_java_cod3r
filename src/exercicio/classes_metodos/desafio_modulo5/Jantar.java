package classes_metodos.desafio_modulo5;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.150);
        Comida c2 = new Comida("Feijão", 0.200);
        Comida c3 = new Comida("Bife", 0.400);

        Pessoa p1 = new Pessoa("Carlos", 85);

        System.out.println(p1.apresentacao());
        p1.comer(c1);
        p1.comer(c3);
        p1.comer(c2);
        System.out.println(p1.apresentacao());
    }
}
