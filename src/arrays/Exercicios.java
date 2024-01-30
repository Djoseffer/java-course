package arrays;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.5;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 9.05;

        //Exemplo executando o array colocando em uma váriavel
        var format = Arrays.toString(notasAlunoA);
        System.out.println(format);

        //Acessando um item dentro do array
        System.out.println(notasAlunoA[0]);

        //Exemplo executando o array direto pelo sout
        System.out.println(Arrays.toString(notasAlunoA));

        //Tirando a média do aluno utilizando o for
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += notasAlunoA[i];
        }
        System.out.println(total / 3);

        //Tirando a média usando o for, porém com melhoria, usando o length
        double total2 = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total2 += notasAlunoA[i];
        }
        System.out.println(total / notasAlunoA.length);

        //Outra forma de array
        double total3 = 0;
        double[] notasAlunoB = {0.9, 9, 10, 8.5};
        for (int i = 0; i < notasAlunoB.length; i++) {
            total3 += notasAlunoB[i];
        }
        System.out.println(total3 / notasAlunoB.length);
    }
}
