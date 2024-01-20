package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {
    public static void main(String[] args) {

        //Trabalho deu certo na segunda e na terça
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = !trabalho2 || trabalho1;
        //Operador unario
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou tv 50\"?" + comprouTv50);
        System.out.println("Comprou tv 32\"?" + comprouTv32);
        System.out.println("Comprou sorvete\"?" + comprouSorvete);
        System.out.println("Mais saúdavel?" + maisSaudavel);
    }
}
