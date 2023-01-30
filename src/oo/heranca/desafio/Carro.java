package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    boolean ligado = false;
    protected int velocidaAtual;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if (velocidaAtual + delta > VELOCIDADE_MAXIMA) {
            velocidaAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidaAtual += delta;
        }
        
    }

    public void frear(){
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
