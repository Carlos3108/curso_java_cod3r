package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    double getValorTotal(){
        double total = 0;

        for(Compra compraAtual: compras){
            total += compraAtual.getValorTotal();
        }
        return total;
    }
}
