package classes_metodos;

public class Produto_Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 3000.00;
        p1.desconto = 0.15;
        p1.valor = p1.preco - (p1.preco * p1.desconto);

        var p2 = new Produto();

        p2.nome = "Caneta";
        p2.preco = 2.50;
        p2.desconto = 0.05;
        p2.valor = p2.preco - (p2.preco * p2.desconto);

    System.out.println(p1.nome + " - R$ " + (p1.valor));
    System.out.println(p2.nome + " - R$ " + (p2.valor));
    }
}
