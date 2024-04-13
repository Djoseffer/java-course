package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Java", "Pyton", "PHP");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);
        Integer ultimoItem = (Integer) ListaUtil.getUltimo1(numeros);
        System.out.println(ultimoItem);

        List<String> langs2 = Arrays.asList("Java", "Pyton", "PHP");
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5);

        //No exemplo abaixo foi usado o getUltimo2 que foi definido como tipo generics e facilitou a chamada na lista
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs2);
        System.out.println(ultimaLinguagem2);
        Integer ultimoItem2 = ListaUtil.getUltimo2(numeros2);
        System.out.println(ultimoItem2);
    }
}
