package desafioModulo;

public class Jantar {
    public static void main(String[] args) {

        var c1 = new Comida("Feijão", 0.200);
        var c2 = new Comida("Arroz", 0.100);
        var p1 = new Pessoa("Alberto",70.00);
        var p2 = new Pessoa("Carlos",90.00);
        p1.comer(c1);
        p2.comer(c2);

        System.out.println("Alberto tem " + p1.peso + " kg e ganhou " + c1.peso + " grm após jantar, Alberto está com " + p1.total );
        System.out.println("Carlos tem " + p2.peso + " e ganhou " + c2.peso + " grm após jantar, Alberto está com " + p2.total);
        System.out.println("Alberto comeu " + c1.nome + " e " + "Carlos comeu " + c2.nome);
    }

}