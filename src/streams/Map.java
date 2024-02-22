package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLera = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        //Usando composição
        System.out.println("\n\nUsando Composição...");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLera)
                .map(grito)
                .forEach(print);

    }
}
