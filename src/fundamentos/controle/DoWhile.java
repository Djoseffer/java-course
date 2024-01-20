package fundamentos.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("Você prcisa dizer as palavras magicas");
            System.out.println("Você quer sair?");
            text = entrada.nextLine();
        } while (!text.equalsIgnoreCase("Por favor"));
        System.out.println("Obrigado");
    }
}
