package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", "Silva", 30);
        System.out.println(pessoa.nomeCompleto());
    }
}
