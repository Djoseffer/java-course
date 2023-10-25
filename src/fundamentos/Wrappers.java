package fundamentos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
            //Classes, Byte, Short, Integer, Long
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt(entrada.nextLine());
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        //Classe Float
        Float f = 123.0F;
        System.out.println(f);

        //Classe Double
        Double d = 1234.1234;
        System.out.println(d);

        //Classe Boolean
        Boolean bo = Boolean.parseBoolean("True");
        System.out.println(bo);
        //Classe Character

        Character c = '#';
        System.out.println(c.toString());
        entrada.close();
    }
}
