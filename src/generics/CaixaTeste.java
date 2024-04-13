package generics;

public class CaixaTeste {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("Segredo !");

        System.out.println(caixaA.abrir());

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.aguardar(22.4);

        System.out.println(caixaB.abrir());

    }
}
