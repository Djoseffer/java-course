package oo.polimorfismo;

public class Arroz {

    private double peso;

    public double getPeso() {
        return peso;
    }

    public Arroz(double peso) {
        setPeso(peso);
    }

    public void setPeso(double peso) {
        if (peso >=0)
            this.peso = peso;
    }
}
