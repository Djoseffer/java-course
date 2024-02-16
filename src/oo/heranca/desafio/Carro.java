package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADEMAXIMA;
    int velocidadeAtual;

    Carro(int velocidadeMaxima){
        VELOCIDADEMAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidadeAtual + 5 > VELOCIDADEMAXIMA){
            velocidadeAtual = VELOCIDADEMAXIMA;
        }else {
            velocidadeAtual +=5;
        }
    }

    void frear(){
        if (velocidadeAtual >= 5){
            velocidadeAtual -=5;
        }else{
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }

}
