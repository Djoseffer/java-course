package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        //Exemplos de tipos não primitivos e funcionalidades a partir do ponto
        String s = "Bom dia x";
        s = s.replace("x", "senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        //Outras formas de chamar metodos derivados da string através do ponto
        String y = "Bom dia x".replace("x", "Tom").toUpperCase().concat("!!!");
        System.out.println(y);
    }
}
