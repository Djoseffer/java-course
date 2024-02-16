package oo.polimorfismo.polimorfismo2;

public class Jantar {
    public static void main(String[] args) {

        Pessoa cliente = new Pessoa(60);

        Arroz refeicao1 = new Arroz(0.2);
        Feijao refeicao2 = new Feijao(0.2);

        cliente.comer(refeicao1);
        cliente.comer(refeicao2);

        System.out.println(cliente.getPeso());

        Sorvete sobremesa = new Sorvete(1.11);

        cliente.comer(sobremesa);

        System.out.println(cliente.getPeso());
    }
}
