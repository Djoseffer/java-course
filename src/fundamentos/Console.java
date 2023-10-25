package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("BOM");
        System.out.print(" Dia\n");
        System.out.println("Bom");
        System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        System.out.printf("%s", "JOÃO");

        Scanner entrada = new Scanner(System.in);

        //Imprimir nome no console
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("\n\nNome " + nome);

        //Imprimir sobrenome no console
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.println("\n\nnome= " + " " + nome + " " + sobrenome);

        //Imprimir idade
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        //Sempre fechar o scanner no final
        entrada.close();

    }
}
