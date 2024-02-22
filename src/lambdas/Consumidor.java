package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<String> imprimir = valor -> System.out.println(valor);
        Consumer<Produto> imprimirProduto  = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Apontador", 5.00, 2);
        imprimirProduto.accept(p1);
        Produto p2 = new Produto("Caneta", 10.00, 5);

        Produto p3 = new Produto("Lápis", 2.00, 1.5);


        List<Produto> produtos =  Arrays.asList(p1, p2, p3);

        produtos.forEach(imprimirProduto);
        produtos.forEach(p -> System.out.println(p.preco));
    }
}
