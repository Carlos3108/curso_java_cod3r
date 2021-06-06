package fundamento;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        System.out.println(c);

        double d;
        d = 15.5;
        System.out.println(d);

        /**
         * É possivel determinar o tipo da variavel colocando var e depois o seu valor, porem não é possivel alterar o seu tipo porque ela fica amarrada ao primeiro valor informado.
         * 
         * Não é possivel declarar uma variavel em uma linha e inicia-la em outra, para o java inferir o tipo da variavel ela precisa ser iniciada e chamada na mesma linha.
         */
    }
}
