package fundamento;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        System.out.println("Por favor, digite seus 3 últimos salários:");
        Scanner salarios = new Scanner(System.in);

        System.out.println("Digite o seu antepenultimo salario:");
        String primeiro = salarios.nextLine().replace(",", ".");

        System.out.println("Digite o seu antepenultimo salario:");
        String segundo = salarios.nextLine().replace(",", ".");

        System.out.println("Digite o seu antepenultimo salario:");
        String terceiro = salarios.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(primeiro);
        double salario2 = Double.parseDouble(segundo);
        double salario3 = Double.parseDouble(terceiro);

        double media = (salario1 + salario2 + salario3)/3;

        System.out.println("Essa é a sua media salarial: " + media);

        salarios.close();
    }

}
