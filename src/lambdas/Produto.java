package lambdas;

public class Produto {
    final String nome;
    final double preco;
    final double desconto;
    final double imposto = 8.5;
    double frete1 = 50;
    double frete2 = 100;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
}
