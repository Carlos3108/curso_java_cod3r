package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Carlos Silva";
        compra1.adicionarItem(new Item("Caneta", 20, 7.5));
        compra1.adicionarItem(new Item("Borracha", 12, 3.9));
        compra1.adicionarItem(new Item("Caderno", 3, 18));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());
    }
}
