package oo.polimorfismo.polimorfismo2;

public class Alimento {
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Alimento(double peso) {
        setPeso(peso);
    }
}
