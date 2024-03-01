package excecao.personalizadaA;

import streams.Aluno;

public class TestesValidacoes {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("", -5);
            Validar.aluno(aluno);
        }catch (StringVaziaException | NumeroNegativoException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }
}
