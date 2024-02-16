package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        //O conceito map utiliza de chave e valor

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");//Aqui o put tá adicionando
        usuarios.put(1, "Ricardo");//Aqui o put tá substituindo
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());//Vai retornar o conjunto das chaves
        System.out.println(usuarios.values());//Vai retornar os valores
        System.out.println(usuarios.entrySet());//Vai retornar as chaves e valores
        System.out.println(usuarios.containsKey(3));//Vai verificar se o conjunto possuí a key
        System.out.println(usuarios.containsValue("Rafaela"));//Vai verificar se o conjunto possuí o valor
        System.out.println(usuarios.get(2));//Vai buscar o elemento pela key e trazer o valor

        //Percorrendo as chaves
        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        //Percorrendo valores
        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "==> ");
            System.out.println(registro.getValue());
        }
    }
}
