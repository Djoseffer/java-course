package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add (new Usuario("Alan"));
        usuarios.add(new Usuario("Bia"));
        usuarios.add(new Usuario("André"));

        boolean resultado = usuarios.contains(new Usuario("Alan"));
        System.out.println(resultado);
    }
}
