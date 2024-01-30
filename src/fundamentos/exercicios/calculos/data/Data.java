package fundamentos.exercicios.calculos.data;

public class Data {

    Integer dia = 1;
    Integer mes = 1;
    Integer ano = 1;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }



    Data(){
    }

    String dataFormatada(){
     return String.format("%d/%d/%d", dia, mes, ano);
    }
}
