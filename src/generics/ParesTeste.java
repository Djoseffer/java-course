package generics;

public class ParesTeste {
    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Marci");
        resultadoConcurso.adicionar(3, "Mario");
        resultadoConcurso.adicionar(4, "Marcos");
        resultadoConcurso.adicionar(5, "Bruno");

        System.out.println(resultadoConcurso.getValor(1));
    }
}
