package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Bia", 10);
        Aluno a2 = new Aluno("Dria", 8);
        Aluno a3 = new Aluno("Lana", 1.3);
        Aluno a4 = new Aluno("Barbara", 6.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (al1, al2) -> {
          if (al1.nota > al2.nota) return 1;
          if (al1.nota < al2.nota) return -1;
          return 0;
        };

        //Nesse exemplo o max vai retornar a melhor nota
        System.out.println(alunos.stream().max(melhorNota).get());

        //Neste exemplo o min vai retornar a pior nota
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
