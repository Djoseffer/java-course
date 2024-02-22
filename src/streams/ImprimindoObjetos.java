package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Maju", "Bia");

        //Usando o fori
        System.out.println("Usando o fori");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        //Usando o foreach
        System.out.println("Usando foreach");
        for (String nome: aprovados){
            System.out.println(nome);
        }

        //Usando iterator
        System.out.println("Usando Iterator");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Usando Stream
        System.out.println("Usando Stream");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
