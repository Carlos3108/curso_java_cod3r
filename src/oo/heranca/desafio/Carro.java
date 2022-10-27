package oo.heranca.desafio;

public class Carro {
    boolean ligado = false;
    int velocidaAtual = 0;

    void acelerar(){
        velocidaAtual += 5;
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
