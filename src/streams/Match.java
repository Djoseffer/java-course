package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bia", 10);
        Aluno a2 = new Aluno("Dria", 8);
        Aluno a3 = new Aluno("Lana", 1.3);
        Aluno a4 = new Aluno("Barbara", 6.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Predicate<Aluno> reprovados = aprovados.negate();

        //Se todos forem aprovados retorna true, caso contrário false
        System.out.println(alunos.stream().allMatch(aprovados));
        //Algum aluno aprovado, ou seja se tiver um aprovado ele já retorna true
        System.out.println(alunos.stream().anyMatch(aprovados));
        //Mesmo princípio, porém retorna true caso nenhum for aprovado
        System.out.println(alunos.stream().noneMatch(aprovados));
        //
    }
}
