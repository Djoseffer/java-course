package fundamentos;

public class ConversaoNumeroParaString {
    public static void main(String[] args) {

        Integer num1 = 1000;
        System.out.println(num1.toString().length());

        //Outra forma de conversão, usando o tipo primitivo
        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());

        //Mais uma forma porém a menos viavel
        System.out.println(("" + num2).length());
    }
}
