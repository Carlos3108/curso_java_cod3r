package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Heroi j1 = new Heroi();
        j1.x = 10;
        j1.y = 10;

        Monstro j2 = new Monstro();
        j2.x = 10;
        j2.y = 11;

        System.out.println("Jogador 1 = " + j1.vida);
        System.out.println("Jogador 2 = " + j2.vida);

        j1.atacar(j2);

        System.out.println("Jogador 1 = " + j1.vida);
        System.out.println("Jogador 2 = " + j2.vida);
    }
}
