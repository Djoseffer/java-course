package generics;

public class CaixaIntTeste {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.aguardar("Teste");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
