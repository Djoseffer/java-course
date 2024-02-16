package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //offer e add servem para adicionar elementos a lista
        // A diferença é o comportamento quando a fila está cheia
        //Um joga uma exceção e outro um false

        fila.add("Anna");
        fila.offer("Carlos");
        fila.add("Rafaela");
        fila.offer("Gui");
        fila.add("Daniel");
        fila.offer("Bia");

        System.out.println(fila.peek()); // Vai pegar o próximo elemento da fila
        System.out.println(fila.element()); // Também vai pegar o próximo elemento da fila
        //A diferença do peek e element é quando a fila está vazia, um gera uma exceção e outro retorna null

        fila.size();
        fila.isEmpty();
        fila.clear();
        //fila.contains();

        System.out.println(fila.poll());// Vai remover o próximo da lista
        System.out.println(fila.remove());// Também vai remover o próximo da lista
        //A diferença do pool e remove é quando a fila está vazia, um gera exceção e outro null

    }
}
