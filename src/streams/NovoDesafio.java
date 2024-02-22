package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NovoDesafio {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("João", 19, true);
        Cliente c2 = new Cliente("Mario", 15, false);
        Cliente c3 = new Cliente("Pedro", 29, true);
        Cliente c4 = new Cliente("Maria", 16, false);
        Cliente c5 = new Cliente("Joana", 39, true);
        Cliente c6 = new Cliente("Tom", 40, false);

        List<Cliente> assinantes = Arrays.asList(c1, c2, c3, c4, c5, c6);

        Predicate<Cliente> maioridade = a -> a.age >= 18;
        Predicate<Cliente> assinante = a -> a.assinante;

        assinantes.stream().filter(maioridade)
                .filter(assinante)
                .map( a -> a.name + " você está autorizado" )
                .forEach(System.out::println);
    }
}
