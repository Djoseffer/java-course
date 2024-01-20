package fundamentos.operadores;

public class Atribuição {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c = c + b; // essa expressão pode ser simplificada da forma abaixo
        c += b;

        c = c - a; // essa expressão pode ser simplificada da forma abaixo
        c -= a;

        c = c * b; // essa expressão pode ser simplificada da forma abaixo
        c *= b;

        c = c / a; // essa expressão pode ser simplificada da forma abaixo
        c /= a;

        c = c % 2; // essa expressão pode ser simplificada da forma abaixo
        c %= 2;

        //Uma outra forma de atribuição é essa
        c = c++; //Nesse exemplo o c é igual a c+1

        System.out.println(c);
    }
}
