package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bia", 10);
        Aluno a2 = new Aluno("Dria", 8);
        Aluno a3 = new Aluno("Lana", 1.3);
        Aluno a4 = new Aluno("Barbara", 6.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> soma = (a, b) -> a + b;

        alunos.stream()
                .filter(aprovados)
                .map(apenasNota)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
