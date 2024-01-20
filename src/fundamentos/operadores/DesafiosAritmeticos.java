package fundamentos.operadores;

public class DesafiosAritmeticos {
    public static void main(String[] args) {

        var a = 6 * (3+2);
        var b = Math.pow(a, 2) / (3*2);

        var c = (1-5)*(2-7) / 2;
        var d = Math.pow(c, 2);

        var f = Math.pow((b - d), 3) / Math.pow(10,3);

        System.out.println("O resultado é " + f);


    }
}
