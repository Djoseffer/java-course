package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double valor = 10;
        double fahrenheit = 32;
        double multiplicador = 5.0 / 9.0;
        String msg = "O valor da conversão é ";
        double celsios = (valor - fahrenheit) * multiplicador;

        valor = 120;
        System.out.println(msg + celsios);
        celsios = (valor - fahrenheit) * multiplicador;
        System.out.println(msg + celsios);
    }
}
