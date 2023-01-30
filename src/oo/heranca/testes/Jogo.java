package oo.heranca.testes;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi(10, 11);

        Monstro monstro = new Monstro(10, 10);

        System.out.println("Heroi tem = " + monstro.vida);
        System.out.println("Monstro tem = " + heroi.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        monstro.andar(Direcao.NORTE);
        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Heroi tem = " + heroi.vida);
        System.out.println("Monstro tem = " + monstro.vida);
    }
}
