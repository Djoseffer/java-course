package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      //Tirando a média e convertendo string pra double
        System.out.println("Digite os seus 3 ultimos salários");

        System.out.print("Seu primeiro salário");
        var valor1 = entrada.next().replace(",", ".");

        System.out.print("Seu segundo salário");
        var valor2 = entrada.next().replace(",", ".");

        System.out.print("Seu terceiro salário");
        var valor3 = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

         double media = (salario1 + salario2 + salario3) /3;

        System.out.println("A média slarial é " + media);

        entrada.close();
    }
}
