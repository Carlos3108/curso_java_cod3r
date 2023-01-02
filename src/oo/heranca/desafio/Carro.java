package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    boolean ligado = false;
    int velocidaAtual = 0;
    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidaAtual + delta > VELOCIDADE_MAXIMA) {
            velocidaAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidaAtual += delta;
        }
        
    }

    void frear(){
        if(velocidaAtual >= 5){
            velocidaAtual -= 5;
        } else {
            velocidaAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual é " + velocidaAtual + "KM/h";
    }
}
