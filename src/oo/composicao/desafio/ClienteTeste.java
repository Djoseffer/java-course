package oo.composicao.desafio;

import static oo.composicao.desafio.Cliente.listarCompras;

public class ClienteTeste {
    public static void main(String[] args) {

        // Adicionar compras com itens à lista
        Compra compra1 = new Compra("Comprador1");
        compra1.adicionarItem(new Item("Produto1", 2, 10.5));
        compra1.adicionarItem(new Item("Produto2", 1, 5.0));
        compra1.compras.add(compra1);

        Compra compra2 = new Compra("Comprador2");
        compra2.adicionarItem(new Item("Produto3", 3, 8.75));
        compra1.compras.add(compra2);

        // Listar as compras
        listarCompras(compra1.compras);
    }


}
