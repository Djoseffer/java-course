package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {

        //É possivel realizar operações dentro do System out
        System.out.println(2+3);

        //É possivel atribuir valor a variaveis
        var x = 5;
        double y = 3;
        System.out.println(x + y);
        System.out.println(x * y);

        int a = 10;
        int b = 30;
        System.out.println(a + b);
        System.out.println(a * b);
        //No exemplo abaixo esta sendo feito uma conversão, um(cast) de um int para double
        System.out.println(b / (double) a);
        //Abaixo um exemplo utilizando o operador modulo que dá o resto de uma divisão
        int c = 8;
        int d = 3;
        System.out.println(c % d);
    }
}
