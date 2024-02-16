package oo.heranca.desafio;

public class Gol extends Carro{

    Gol(){
        this(150);
    }
    Gol(int velocidadeMaxima){
        super(velocidadeMaxima);
    }


    int velocidadeAtual ;
    void frear(){
        if (velocidadeAtual >1){
            velocidadeAtual -=5;
        }else {
            velocidadeAtual = 0;
        }
    }

    void acelerar(){
        velocidadeAtual += 5;
    }

    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }
}
