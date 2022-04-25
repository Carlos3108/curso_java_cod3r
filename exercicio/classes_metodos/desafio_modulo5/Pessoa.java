package classes_metodos.desafio_modulo5;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nomePessoa, double pesoPessoa){
        nome = nomePessoa;
        peso = pesoPessoa;
    }
    void comer(Comida comida){
        if (comida != null){
            peso += comida.peso;
        }
    }
    String apresentacao(){
        return nome + ": " + peso + "Kg";
    }
}
