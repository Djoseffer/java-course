package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        // No bloco de código finally o código dentro dele será executado independentemente de ocorrer exceção ou não

        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println(7 / entrada.nextInt());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally");
            entrada.close();
        }
        System.out.println("Fim");
    }
}
