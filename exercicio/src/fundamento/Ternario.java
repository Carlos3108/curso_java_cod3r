package fundamento;

public class Ternario {
    public static void main(String[] args) {
        double media = 5.6;
        String resultadoParcial = media >= 5.0 ? "Recuperação" : "Reprovado";
        String resultadoFinal = media >= 7.0 ? "Férias" : resultadoParcial;

        System.out.println("O aluno está de: " + resultadoFinal);

        double nota = 7.7;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim" : "Não";

        System.out.println("Tem desconto: %s" + resultado);
    }
}
