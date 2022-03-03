package classes_metodos;

public class Produto_Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3000.00, 0.15);

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 2.50;
        p2.desconto = 0.05;

    System.out.println(p1.nome + " - R$ " + p1.valor());
    System.out.println(p2.nome + " - R$ " + p2.valor());
    }
}
