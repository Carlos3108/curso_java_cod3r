package classes_metodos.exercicio_data;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição pore valor (Primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; //atribuição por referencia (Objeto);

        d1.dia = 31;
        d2.mes = 8;
        d1.ano = 2000;

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

        voltarDataPadrao(d1);
        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataPadrao (Data padrao){
        padrao.dia = 1;
        padrao.mes = 1;
        padrao.ano = 1970;
    }
    static void alterarPrimitivo(int a){
        a++;
    }
}
