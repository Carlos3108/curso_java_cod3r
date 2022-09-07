package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }

    double getValorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
