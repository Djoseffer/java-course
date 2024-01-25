package fundamentos.exercicios.calculos.data;

public class Data {

    Integer dia = 01;
    Integer mes = 01;
    Integer ano = 01;

    Data(int dd, int mm, int aa){
        dia = dd;
        mes = mm;
        ano = aa;
    }

    Data(){

    }

    String dataFormatada(){
     return String.format("%d/%d/%d", dia, mes, ano);
    }
}
