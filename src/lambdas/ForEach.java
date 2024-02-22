package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nVersão com lambda");
        aprovados.forEach((nome)->{System.out.println(nome + "!!!");});

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);

        System.out.println("\nVersão com lambda");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference2");
        aprovados.forEach(ForEach::meuImprimir);


    }
    private static void meuImprimir(String nome) {
    }
}
