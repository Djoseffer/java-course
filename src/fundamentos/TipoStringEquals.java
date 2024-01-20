package fundamentos;

public class TipoStringEquals {
    public static void main(String[] args) {

        //Neste exemplo mesmo tendo os mesmo valores quando forem comparados
        //o resultado sera false.
        String s = new String("2");
        System.out.println(s == "2");

        //Para fazer esta comparação de maneira correta, deve ser utilizado o ponto.
        //Exemplo
        System.out.println("2".equals(s));
        //O ideal é utilizar o .equals quando for fazer comparação de strings
    }
}
