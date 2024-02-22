package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<String> binaryString = nums.stream()
                .map(Integer::toBinaryString)
                .map(binaryS -> new StringBuilder(binaryS).reverse().toString()).toList();

        List<Integer> convertedIntegerList = binaryString.stream()
                .map(binaryS -> Integer.parseInt(new StringBuilder(binaryS).reverse().toString(), 2))
                .toList();

        System.out.println("\nLista de números\n");
        nums.forEach(System.out::println);

        System.out.println("\nStrings binárias invertidas:\n");
        binaryString.forEach(System.out::println);

        System.out.println("\nNúmeros inteiros convertidos de volta:\n");
        convertedIntegerList.forEach(System.out::println);
    }
}
