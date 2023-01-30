package oo.heranca.desafio;

public class Ferrari extends Carro{
    public Ferrari(){
        this(350);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }

//    @Override
//    void acelerar() {
//        velocidaAtual += 15;
//    }
}
