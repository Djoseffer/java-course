package arrays;

public class ForEach {
    //Formas de percorrer um array
    public static void main(String[] args) {
        double[] notas = {5.3, 7, 9, 6};

        //for tradicional
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+ " ");

            System.out.println();

            for (double nota: notas) {
                System.out.print(nota + " ");
            }
            
        }
    }
}
