package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        //Esses operadores vão comparar e retornar true ou false

        //3 é maior que 4?
        System.out.println(3 > 4); //false
        //3 é maior ou igual a 3
        System.out.println(3 >= 3); //true
        //3 é menor que 7
        System.out.println(3 < 7); //true
        //30 é menor ou igual a 7
        System.out.println(30 <= 7); //false
        //30 é diferente ou igual a 7
        System.out.println(30 != 7); //true

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >=7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println(" Tem desconto? " + temDesconto);




        //Sempre usar os simbolos de maior ou menor na frente

    }
}
