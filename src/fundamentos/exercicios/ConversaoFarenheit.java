package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius");
        double celsius = input.nextDouble();

        double conversao = celsius * 1.8 + 32;

        System.out.println("Valor em farenheit " + conversao);

        input.close();
    }
}
