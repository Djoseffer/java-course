package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        //No conceito pilha o ultimo a entrar é o primeiro a sair

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno princípe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.pop()); //Também remove item da pilha, porém lança uma exceção

        //Os principios dos metodos são os mesmos que foram utilizados no lista

    }
}
