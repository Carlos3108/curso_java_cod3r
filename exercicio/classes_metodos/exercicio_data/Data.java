package classes_metodos.exercicio_data;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterData(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
