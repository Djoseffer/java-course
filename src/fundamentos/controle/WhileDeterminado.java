package fundamentos.controle;

public class WhileDeterminado {
    public static void main(String[] args) {

        //O while vai repetir determina condição de acordo com o que a gente precisar
        //Deve ser colocado o incremento no valor da variavel para evitar loopins infinitos
        int contador = 1;

        while (contador <= 10) {
            System.out.printf("i = \n%d",contador);
            contador += 2;
        }
    }
}
