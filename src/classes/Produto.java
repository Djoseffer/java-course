package classes;

public class Produto {
    String nome;
    Double preco;
    static Double desconto = 0.25;

    //No exemplo abaixo está um novo construtos da classe produto
    Produto(String nomeInicial, Double precoInicial, Double descNatal) {
        nome = nomeInicial;
        preco = precoInicial- (descNatal * precoInicial);
    }

    Produto() {
    }

    Double precoComDesconto() {
        return desconto * preco;
    }

    //Mostrando que é possível criar 2 metodos com o mesmo nome, porém com números de parametros diferentes


}
