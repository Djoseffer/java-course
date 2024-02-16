package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        //Exemplo de função lambda
        Calculos soma = (x, y) -> {return x + y; };

        //Quando não usar chaves, automaticamente vai ser retornado o resultado da função
        Calculos soma2 = (a, b) -> a + b;

        System.out.println(soma.executar(2, 3));
        System.out.println(soma2.executar(2, 3));
    }
}
