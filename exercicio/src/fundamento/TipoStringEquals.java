package fundamento;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("S");
        System.out.println("2" == s);
        System.out.println("2".equals(s)); //equals faz a comparação do conteudo;

        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.nextLine(); //next remove as linhas;
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim())); //.trim remove os espaços em brancos;

        entrada.close();

        //Sempre comparar Strings utilizando o '.equals()';
    }
}
