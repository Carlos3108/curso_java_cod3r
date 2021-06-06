package fundamento;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 27;
        short numeroDeVoos = 32758;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; //Utiliza a letra L para definir um literal long quando passa o tamanho de um inteiro;

        //tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipos Booleanos
        boolean estaDeFerias = false; //ou true

        //Tipo caractere
        char status = 'A'; //Ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365); 

        //Numeros de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        //Salario
        System.out.println(id + ": ganha " + salario);

        //Ferias
        System.out.println("Férias? " + estaDeFerias);

        //Ativo
        System.out.println("Status: " + status);
    }
}
