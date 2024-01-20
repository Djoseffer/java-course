package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        //Usando operadores ternarios para tomadas de decisão.
        double media = 8.6;
        String resultado = media >= 7.0 ? "Aprovado" : media >= 5 ? "recuperação" : "Reprovado";

        System.out.println(resultado);

        String desconto = media >= 8 ? " Tem desconto" : "Não tem desconto";
        System.out.println(desconto);
    }
}
