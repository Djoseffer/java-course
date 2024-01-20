package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        //No desafio o usuario vai inserir um numero e dizer qual operação ele quer fazer.
        //Operações que ele pode usar + - * / %


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor");
        double num1 = entrada.nextDouble();

        System.out.println("Digite a operação");
        String operacao = entrada.next();

        System.out.println("Digite outro valor");
        double num2 = entrada.nextDouble();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %.2s %.2f = %.2f", num1, operacao, num2,resultado);

        entrada.close();


    }
}
