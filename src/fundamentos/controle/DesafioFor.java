package fundamentos.controle;

public class DesafioFor {
    public static void main(String[] args) {

          //Desafio, criando um for sem usar númericos
        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
