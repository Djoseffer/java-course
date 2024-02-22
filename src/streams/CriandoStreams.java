package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> printl = System.out::println;
        Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
        langs.forEach(print);

        String[]maisLangs = {"Pyton ", "Lisp ", "Perl ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        //Abaixo ele vai pegar de um indice até o outro que você definir
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("C" ,"PHP ", "Kotlin");
        outrasLangs.stream().forEach(print);
        //Abaixo os dados não são processados na ordem
        outrasLangs.parallelStream().forEach(print);

        //Abaixo uma ordenação infinita
        //Stream.generate(()-> "A").forEach(print);

        //Abaixo uma ordenação que também é infinita porém tem um ponto departida
        //Stream.iterate(0, n -> n + 1).forEach(printl);

    }
}
