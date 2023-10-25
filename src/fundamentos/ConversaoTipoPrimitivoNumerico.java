package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        //Conversão implicita
        double a = 1;
        System.out.println(a);

        //Conversão explicita, cast
        float b = (float) 1.0332;
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);


    }
}
