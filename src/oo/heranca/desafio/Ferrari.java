package oo.heranca.desafio;

public class Ferrari extends Carro{
    Ferrari(){
        this(350);
    }

    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }

//    @Override
//    void acelerar() {
//        velocidaAtual += 15;
//    }
}
