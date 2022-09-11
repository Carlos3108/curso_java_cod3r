package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }

    void addItem(String nome, double preco, int qtde){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double getValorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
