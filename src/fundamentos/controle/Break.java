package fundamentos.controle;

public class Break {
    public static void main(String[] args) {

     //Neste exemplo o break interrompe o loop no 5 deixando o false
        for (int i = 0; i <10; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim");
    }
}
