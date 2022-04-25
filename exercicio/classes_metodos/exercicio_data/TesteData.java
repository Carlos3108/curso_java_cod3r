package classes_metodos.exercicio_data;

public class TesteData {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.ano = 2001;

        var d2 = new Data(31, 8, 2000);

        String dataFormatada1 = d1.obterData();

        System.out.println(dataFormatada1);
        System.out.println(d2.obterData());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
