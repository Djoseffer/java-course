package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        //Abaixo uma forma de adicionar elementos a lista Usuario
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        //Abaixo outra forma de adicionar elementos a lista de Usuario
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); //Acessar pelo índice
        lista.remove(1); // Remove um elemento pelo index
        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));//pesquisa e ver se tem o elemento na lista

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
