package classes;

public class AreaCircTest {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10.00);
        //a1.pi = 10.00;

        AreaCirc a2 = new AreaCirc(5.00);
        //a1.pi = 5.00;

        //Abaixo esta sendo acessado o valor de pi diretamente pela classe static,
        // por ser static não é necessário construtor
        AreaCirc.pi = 3.1414;

        System.out.println(a2.area());
        System.out.println(a1.area());

    }
}
