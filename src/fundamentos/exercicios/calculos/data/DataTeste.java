package fundamentos.exercicios.calculos.data;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data(28, 1, 1990);

        var data2 = new Data();
        data2.dia = 1;
        data2.mes = 12;
        data2.ano = 2024;

        var data3 = new Data();

        System.out.println(data2.dataFormatada());
        System.out.println(data1.dataFormatada());
        System.out.printf(data3.dataFormatada());
    }
}
