package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();

        j1.y = 10;
        j1.x = 20;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.OESTE);
        j1.andar(Direcao.OESTE);
        j1.andar(Direcao.SUL);

        System.out.println(j1.y);

    }
}
