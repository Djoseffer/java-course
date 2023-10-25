package fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        //O var atribui o tipo padrão a variavel sem precisar tipar de forma especifica
        var text = "Hello world ";
        var number = 10;
        var soma = 10 + 5;

        System.out.println(text + "Seu salário é " + number + " " + soma);

        //Outra forma de se usar uma variavel abaixo.
        double numero;    //Variavel declarada
        numero = 24;      //Variavel iniciada
        System.out.println(numero); //Variavel utilizada
        
    }
}
