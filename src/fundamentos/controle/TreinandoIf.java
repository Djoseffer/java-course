package fundamentos.controle;

import java.util.Scanner;

public class TreinandoIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double media = entrada.nextDouble();
        boolean aprovado = media <= 10 && media >= 7;
        boolean recuperacao = media >= 5 && media <7;
        boolean reprovado = media >= 0 && media < 5;

        if (aprovado){
            System.out.println("Parabéns você esta aprovado");
        }
        if (recuperacao) {
            System.out.println("Você esta de recuperação");
        }
        if (reprovado) {
            System.out.println("Você esta reprovado");
        }
        else {
            System.out.println("Nota inválida");
        }
        entrada.close();
    }
}
