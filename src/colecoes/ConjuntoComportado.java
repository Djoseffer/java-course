package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Hashset, com conjunto homogêneo

        //<String> significa que o conjunto só vai aceitar valor do tipo string
        //Set<String> listaAprovados = new HashSet<>(); //Conjunto desordenado
        SortedSet<String> listaAprovados = new TreeSet<>(); //Conjunto ordenado
        listaAprovados.add("Ana");
        listaAprovados.add("Pedro");
        listaAprovados.add("Luca");
        listaAprovados.add("Marcos");

        for (String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(123);
        nums.add(6);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
