package fundamento;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Boa Tarde".charAt(2));

        String s = "Boa tarde";

        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(
            s.toLowerCase()
            .startsWith("boa"));
        System.out.println(s.length());
        System.out.println(
            s.toLowerCase()
            .endsWith("tarde"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Silva";
        var idade = 20;
        var salario = 11200.98;

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f\n", 
            nome, sobrenome, idade, salario);

        String frase = String
            .format("O senhor %s %s tem %d anos e ganha R$ %.2f", 
            nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
} 