package oo.heranca.modificadores_acesso.casaA;

public class Paulo {
    Ana esposa = new Ana();
    void testeAcesso(){
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
