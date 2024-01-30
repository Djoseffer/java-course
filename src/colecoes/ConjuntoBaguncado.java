package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        //Hashset, com dados hterogêneos
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("Tamanho é " + conjunto.size());
        System.out.println(conjunto.remove("teste")); //vai retornar false porque está com letra minúscula
        System.out.println(conjunto.remove("Teste")); //aqui vai retornar true
        System.out.println(conjunto.contains("x")); // vai retornar true se o item existir no conjunto

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // Vai unir os conjuntos de forma desordenada
        System.out.println(conjunto);

        conjunto.retainAll(nums); // vai unir os valores que são iguais entre os conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);


    }
}
