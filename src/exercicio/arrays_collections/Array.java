package arrays_collections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4]; //1. ex. de array
        notasAlunoA[0] = 7.5;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 7.85;
        notasAlunoA[3] = 5.0;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        double[] notasAlunoB = {6, 7.5, 8, 7}; //2. ex. de array
        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
