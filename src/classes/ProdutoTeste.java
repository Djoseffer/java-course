package classes;

public class ProdutoTeste {
    public static void main(String[] args) {

        //Abaixo o objeto esta recebendo os parametros do novo construtor
        Produto p1 = new Produto("Notebook", 3100.00, 0.29);

        //Abaixo o objeto esta recebendo parametros do construtor padrão
        var p2 = new Produto();
        p2.nome = "Tablet";
        p2.preco = 1100.99;
        p2.desconto = 0.20;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        Double precoFinal1 = p1.precoComDesconto();
        Double precoFinal2 = p2.precoComDesconto(-0.2);
        Double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média do carrinho R$%.2f.", mediaCarrinho);

    }
}
