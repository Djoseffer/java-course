package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de notas
        System.out.print("Digite o número de notas: ");
        int numeroDeNotas = scanner.nextInt();

        // Criar o array para armazenar as notas
        double[] notas = new double[numeroDeNotas];

        // Loop para armazenar as notas
        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular a média das notas
        double somaNotas = 0;
        for (int i = 0; i < numeroDeNotas; i++) {
            somaNotas += notas[i];
        }

        // Calcular a média
        double media = somaNotas / numeroDeNotas;

        // Exibir a média das notas
        System.out.println("A média das notas é: " + media);

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
