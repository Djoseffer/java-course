package lambdas;

import java.util.function.BinaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Ipad", 100.00, 50);
        BinaryOperator<Double> descontoProduto = (preco, desconto) -> preco - (preco * desconto) / 100;
        Double valorReal = descontoProduto.apply(p.preco, p.desconto);
        BinaryOperator<Double> impostoM = (total, impostoV) -> valorReal + ((valorReal / 100) * p.imposto);
        Double valorComImposto = impostoM.apply(valorReal, p.imposto);

        if (valorReal >= 2500 && valorReal <= 3000) {
            double v1 = Double.parseDouble(String.valueOf(valorComImposto + p.frete1));
            System.out.println("R$" + v1 + " Incluso o valor do imposto municipal e " + p.frete1 + " de frete");
        }
        if (valorReal > 3000) {
            double v2 = Double.parseDouble(String.valueOf(valorComImposto + p.frete2));
            System.out.println("R$" + v2 + " Incluso o valor do imposto municipal e " + p.frete2 + " de frete");
        } else if (valorReal < 2500) {
            double v3 = Double.parseDouble(String.valueOf(valorReal + p.frete1));
            System.out.println("R$" + v3 + "  Isento de impostos e incluso " + "R$" + p.frete1 + " de frete");
        }
    }
}
