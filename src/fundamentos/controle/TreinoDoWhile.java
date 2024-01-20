package fundamentos.controle;

import java.util.Scanner;

public class TreinoDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 6;
        do {
            System.out.println("Acerte o número");
            System.out.println("Digite um número de 0 a 10!");
            num = sc.nextInt();
        } while (num != 6);
        System.out.println("Parabéns você acertou");

        sc.close();
    }
}
