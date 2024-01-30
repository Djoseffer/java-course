package desafioModulo;

public class Pessoa {
    String nome;
    Double peso;
    Double total;

    Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
        this.total = peso;
    }

     void comer(Comida comida){
            if (comida != null) {
                this.total += comida.peso;
            }
    }
}
