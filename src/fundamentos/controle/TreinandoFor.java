package fundamentos.controle;

import java.util.Scanner;

public class TreinandoFor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua lista de compras");
        var listaCompras = entrada.nextLine();
        System.out.println("Digite sua lista de compras");
        var listaCompras2 = entrada.nextLine();
        System.out.println("Digite sua lista de compras");
        var listaCompras3 = entrada.nextLine();

        for (int contador = 0; contador <= 30; contador++) {
            System.out.println(listaCompras + " " + listaCompras2 + " " + listaCompras3);
        }

        entrada.close();
    }
}
