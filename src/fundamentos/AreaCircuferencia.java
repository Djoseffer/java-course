package fundamentos;

public class AreaCircuferencia {
    //Um programa sempre começa com o main
    public static void main(String[] args) {
        int raio = 3;
        // A palavra final torna o valor imutavel ou seja torna uma constante.
        final double numero = 1.50;
        double resultado = numero * raio * raio;
        String palavra = "O resultado é esse ";
        System.out.println(resultado);
        raio = 15;
        resultado = resultado * raio * raio;

        System.out.println(palavra + resultado * raio * raio);
    }
}