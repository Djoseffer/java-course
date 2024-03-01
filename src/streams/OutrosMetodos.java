package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Bia", 10);
        Aluno a2 = new Aluno("Dria", 8);
        Aluno a3 = new Aluno("Lana", 1.3);
        Aluno a4 = new Aluno("Barbara", 6.5);
        Aluno a5 = new Aluno("Bia", 10);
        Aluno a6 = new Aluno("Dria", 8);
        Aluno a7 = new Aluno("Lana", 1.3);
        Aluno a8 = new Aluno("Barbara", 6.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        //O distinct vai eliminar elementos repetidos
        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        //O skip vai dizer a partir de que elemento você que mostrar
        //O limit vai dizer até onde você quer a lista percorra
        System.out.println("\nSkip/limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        //Vai percorrer até encontrar o elemento com o valor passado
        System.out.println("\nTakewhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >=7)
                .forEach(System.out::println);
    }
}
