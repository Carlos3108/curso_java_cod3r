package classes_metodos;

public class Produto_Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3000.00);

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 2.50;

        //mudança no valor do desconto;
        Produto.desconto = 0.25;

        System.out.println(p1.nome + " - R$ " + p1.valor());
        System.out.println(p2.nome + " - R$ " + p2.valor());

        double valorFinal1 = p1.valor();
        double valorFinal2 = p2.valor(0.1);
        double valorCarrinho = (valorFinal1 + valorFinal2) / 2;

        System.out.printf("Média Carrinho = R$%.2f.", valorCarrinho);
    }
}
