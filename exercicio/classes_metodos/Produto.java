package classes_metodos;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(){
        //Dessa maneira o construtor construtor volta a existir
    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double valor (){
        return preco * (1 - desconto);
    }
}
