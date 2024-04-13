package streams;

import java.util.Arrays;
import java.util.List;
public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.0);
        Aluno a2 = new Aluno("Bia", 4.0);
        Aluno a3 = new Aluno("Daniela", 9.0);
        Aluno a4 = new Aluno("Gui", 7.6);
        Aluno a5 = new Aluno("Tom", 6.3);
        Aluno a6 = new Aluno("Clara", 8.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabéns " + a.nome + " você foi aprovado" )
                .forEach(System.out::println);

        //É possível add o predicate e a function acima e chama-los no map posteriormente ex:
        //Predicate<Aluno> aprovado = a -> a.nota >=7;
        //Function<Aluno, String> saudacoesAprovado =  "Parabéns " + a.nome + " você foi aprovado";
    }
}
