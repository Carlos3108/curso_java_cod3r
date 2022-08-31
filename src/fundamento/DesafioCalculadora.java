package fundamento;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
    public static void main(String[] args) {
    /**
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primero valor: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o segundo valor valor: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String op = entrada.next();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
        entrada.close();
    */
    
    String num1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");

    String num2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

    String op = JOptionPane.showInputDialog("Digite o operador: ");

    double numero1 = Double.parseDouble(num1);
    double numero2 = Double.parseDouble(num2);

    double resultado = "+".equals(op) ? numero1 + numero2 : 0;
        resultado = "-".equals(op) ? numero1 - numero2 : resultado;
        resultado = "*".equals(op) ? numero1 * numero2 : resultado;
        resultado = "/".equals(op) ? numero1 / numero2 : resultado;
        resultado = "%".equals(op) ? numero1 % numero2 : resultado;

    System.out.printf("%.2f %s %.2f = %.2f", numero1, op, numero2, resultado);
    }
}
