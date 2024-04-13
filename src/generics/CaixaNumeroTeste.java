package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {

        Caixa<Double> caixaA = new Caixa();
        caixaA.aguardar(23.4);

        Caixa<Integer> caixaB = new Caixa();
        caixaB.aguardar(23);

        System.out.println(caixaA.abrir());

        System.out.println(caixaB.abrir());
    }
}
