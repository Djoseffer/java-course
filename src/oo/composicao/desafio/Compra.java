package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private String comprador;
    private List<Item> itens;

    List<Compra> compras = new ArrayList<>();

    public Compra(String comprador) {
        this.comprador = comprador;
        this.itens = new ArrayList<>();
    }

    public String getComprador() {
        return comprador;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }
}