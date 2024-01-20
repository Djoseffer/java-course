package fundamentos.controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número");
        int numero = Integer.parseInt(valor);

        //Abaixo uma sentença de código com if

        // if (numero % 2 == 0) {
        // System.out.println("Número é par!");
        //  if (numero % 2 == 1) {
        //   System.out.println("Número é ímpar!");


        //Agora abaixo a sentença de código com if e else, que é a forma mais correta
        //As chaves são opcionais
        if (numero % 2 == 0) {
            System.out.println("Número é par!");
        } else
            System.out.println("Número é ímpar!");
    }
}

