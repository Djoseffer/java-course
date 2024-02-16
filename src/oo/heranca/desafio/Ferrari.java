package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

    Ferrari() {
        super(200);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    int velocidadeAtual;

    void frear() {
        if (velocidadeAtual > 1) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
    }

    void acelerar() {

        if (velocidadeAtual + 5 > VELOCIDADEMAXIMA) {
            velocidadeAtual = VELOCIDADEMAXIMA;
        } else {
            velocidadeAtual += 5;
        }
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }

    @Override
    public void ligarTurbo() {
        velocidadeAtual += 50;
    }

    @Override
    public void desligarTurbo() {
        velocidadeAtual=velocidadeAtual;
    }
}

