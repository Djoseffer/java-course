package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "João";
        compra1.itens.add(new Item("Caneta", 20, 1.45));
        compra1.itens.add(new Item("Borracha", 10, 3.45));
        compra1.itens.add(new Item("Caderno", 9, 19.45));
        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
