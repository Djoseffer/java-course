package lambdas;

import java.util.function.UnaryOperator;

public class OperadoresUnarios {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezssDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois.andThen(vezssDois).andThen(aoQuadrado).apply(0);

        System.out.println(resultado1);

    }
}
