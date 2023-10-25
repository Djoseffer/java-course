package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        //Tipo string e suas varias formas de concatenação
        System.out.println("Bom dia pessoal".charAt(2));
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s +"!!!");
        System.out.println(s.startsWith("Bom"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        int idade = 33;
        double salario = 3400.00;

        var frase = nome + sobrenome + idade + salario;

        System.out.println(frase);
        System.out.println("Esta é uma frase qualquer".compareTo(""));
    }
}
