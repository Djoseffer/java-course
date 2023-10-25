package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_575_876_987L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano, só aceita true ou false
        boolean estaDeFerias = true;

        //Tipo caractere
        char status = 'a';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(numeroDeVoos /2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        //Sálario
        System.out.println(id + " Ganha:" + salario);

        //Ferias ou não
        System.out.println("Ferias? " + estaDeFerias );

        //Usando o char
        System.out.println(status + " caracter de status");
    }
}
