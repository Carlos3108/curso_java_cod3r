package classes_metodos.exercicio_data;

public class TesteData {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 31;
        d1.mes = 8;
        d1.ano = 2000;

        var d2 = new Data();
        d2.dia = 8;
        d2.mes = 9;
        d2.ano = 2000;

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

    }
}
