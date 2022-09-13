package oo.composicao.desafio;

public class TesteDesafio {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 2, 1);
        compra1.addItem(new Produto("Caderno", 25), 2);

        Compra compra2 = new Compra();
        compra2.addItem("Notebook", 2000, 2);
        compra2.addItem(new Produto("Impressora", 1050), 1);

        Cliente cliente = new Cliente("Carlos Silva");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.getValorTotal());
    }
}
