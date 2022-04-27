package classes_metodos;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.10;

    Produto(){
        //Dessa maneira o construtor volta a existir
    }

    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    double valor (){
        return preco * (1 - desconto);
    }

    double valor (double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}