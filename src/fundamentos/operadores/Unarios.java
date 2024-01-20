package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        //Abaixo operadores de encremento e decremento
        a++;
        a--;

        //Abaixo outra forma de de fazer essas operações
        ++b;
        --b;

        double y = 5;
        double x = 10;
        double z = x++;
        double w = y--;

        System.out.println(w + z);
    }
}
