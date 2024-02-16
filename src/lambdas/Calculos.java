package lambdas;

@FunctionalInterface
public interface Calculos {
    //Um método dentro de uma interface é obrigatoriamente public
    public abstract double executar(double a, double b);

    //Dentro de uma interface funcional deve existir apenas um metodo abstrato.
    // Pode haver mais metodos se eles forem estaticos ou default
}
