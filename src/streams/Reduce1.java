package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int total = nums.stream().reduce(soma).get();
        System.out.println(total);

        //Dessa forma não é necessário usar o get
        int total2 = nums.stream().reduce(0, soma);
        System.out.println(total2);

        //Dessa forma ela passa um valor inicial
        int total3 = nums.stream().reduce(100, soma);
        System.out.println(total3);

        //Neste exemplo o ifPresent só vai imprimiro resultado caso exista
        nums.stream()
                .filter(n -> n > 10)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
