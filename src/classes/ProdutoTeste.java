package classes;

public class ProdutoTeste {
    public static void main(String[] args) {

        //Abaixo o objeto esta recebendo os parametros do novo construtor
        Produto p1 = new Produto("Notebook", 3000.00, 0.10);

        //Abaixo o objeto esta recebendo parametros do construtor padrão
        var p2 = new Produto();
        p2.nome = "Tablet";
        p2.preco = 1000.00;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        Double precoFinal1 = p1.precoComDesconto();
        Double precoFinal2 = p2.precoComDesconto();
        Double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        //System.out.printf("Média do carrinho R$%.2f.", mediaCarrinho);
        System.out.println(precoFinal1);
        System.out.println(precoFinal2);

    }
}
