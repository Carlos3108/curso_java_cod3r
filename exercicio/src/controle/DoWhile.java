package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        do {
            System.out.println("Escreva " + "as palavras magicas:");
            System.out.println("Quer sair?");
            valor = entrada.nextLine();
        } while (!valor.equalsIgnoreCase("sim por favor"));

        System.out.print("Obrigado!");

        entrada.close();
    }
}

// if(expressão v ou f) sentença; ou {} *Decisão
// while(expressão v ou f) sentença; ou {} *Repetição
// for(variavel; expressão v ou f; modificação da variavel) sentença; ou {}
// do sentença; ou {} while(expressão);