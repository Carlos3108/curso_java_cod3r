package classes_metodos;

public class AreaCirc {
    double raio;
    final static double PI = 3.1415;
    // para definir um valor fixo p/ variavel (final static) ...
    // final é um modificador para definir uma constante;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        return PI * Math.pow(raio, 2);
    }

    static double area (double raio) {
        return PI * Math.pow(raio, 2);
    }

}
