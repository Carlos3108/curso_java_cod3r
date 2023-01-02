package oo.heranca.modificadores_acesso.casaB;

import oo.heranca.modificadores_acesso.casaA.Ana;

public class Julia {
    Ana sogra = new Ana();
    void testeAcesso(){
        System.out.println(sogra.todosSabem);
    }
}
