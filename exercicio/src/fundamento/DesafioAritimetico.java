package fundamento;

public class DesafioAritimetico {
    public static void main(String[] args) {

        //Meu Codigo
        //primeira expressão
        var exp1 = (6 * (3 + 2));
        var exp2 = 3 * 2;
        var quad1 = Math.pow(exp1, 2)/exp2;

        //segunda expressão
        var expr1 = ((1 - 5)*(2 - 7)) / 2;
        var quad2 = Math.pow(expr1, 2);
        
        //terceira expressão
        var sub = quad1 - quad2;
        var divCubo = Math.pow(sub, 3)/Math.pow(10, 3);

        System.out.println("O resultado é: " + divCubo);


        //Codigo da Cod3r
        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;
        System.out.println("O resultado é: " + resultado);
    }
}
