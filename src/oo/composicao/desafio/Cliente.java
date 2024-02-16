package oo.composicao.desafio;

import java.util.List;

public class Cliente {

    public static void listarCompras(List<Compra> compras) {
        for (Compra compra : compras) {
            System.out.println("Comprador: " + compra.getComprador());
            System.out.println("Itens:");

            for (Item item : compra.getItens()) {
                System.out.println("  Produto: " + item.produto +
                        ", Quantidade: " + item.quantidade +
                        ", Preço: " + item.preco);
            }

            System.out.println();
        }
    }

}
