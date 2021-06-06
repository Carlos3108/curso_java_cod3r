package fundamento;

public class AreaCircunferencia {
    public static void main(String[] args) {
        final double pi = 3.14159;
        double raio = 3.4;
        double area = pi * raio * raio;

        System.out.println(area);

        raio = 10;
        area = pi * raio *raio;

        System.out.println("Área = " + area);
    }
}
/*
 * Para definir uma variavel é preciso definir o tipo, nome e depois o valor da
 * variavel. // a palavra final define que ela seja constante.
 */