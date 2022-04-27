package fundamento;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.printf("Mensagem: %d %d %d %d; %n", 1, 2, 3, 4);
        System.out.printf("Nome: %s%n", "Carlos");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close();
    }
}