package classes;

public class Produto {
    String nome;
    Double preco;
    Double desconto;

    //No exemplo abaixo está um novo construtos da classe produto
    Produto(String nomeInicial, Double precoInicial, Double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    Produto() {
    }

    Double precoComDesconto() {
        return preco * (1 - desconto);
    }

    //Mostrando que é possível criar 2 metodos com o mesmo nome, porém com números de parametros diferentes
    Double precoComDesconto(Double decontoDoGerente) {
        return preco * (1 - desconto - decontoDoGerente);
    }

}
