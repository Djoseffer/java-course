package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        //Exemplo de função lambda usando generics, dessa forma não há necessidade de criar uma interface
        BinaryOperator<Double> soma = (x, y) -> {return x + y; };

        System.out.println(soma.apply(2.0, 3.0));
    }
}
