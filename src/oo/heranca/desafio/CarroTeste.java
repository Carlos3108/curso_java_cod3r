package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Ferrari();
        c1.acelerar();
        c1.acelerar();

        Carro c2 = new Fusca();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.frear();

        System.out.println(c1);
        System.out.println(c2);
    }
}
