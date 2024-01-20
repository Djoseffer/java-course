package fundamentos.controle;

import java.sql.Array;
import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes de usuários");
        String nomes = sc.next();


        for (int contador = 1; contador <=15; contador++) {
            System.out.println(nomes);
        }

        sc.close();
    }
}
