package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtAlunos = scanner.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtNotas = scanner.nextInt();

        double[][] notasTurma = new double[qtAlunos][qtNotas];

        double total = 0;
        for (int a = 0; a < notasTurma.length; a++){
            for (int n = 0; n < notasTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasTurma[a][n] = scanner.nextDouble();
                total += notasTurma[a][n];
            }
        }
        double media = total/(qtAlunos*qtNotas);
        System.out.println("Média da turma é " + media);

        scanner.close();
    }
}
