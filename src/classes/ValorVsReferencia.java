package classes;

import javax.xml.crypto.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = a; //Atribuição por valor(tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);
    }
}
