package classes;

public class AreaCirc {

    Double raio;

    //Abaixo está o valor de pi static, assim ele ainda pode ser alterado sendo chamado diretamente.
    //Para tornar o valor imutável é necessário torná-lo uma constante, adicionar a palavra final no início
    static Double pi = 3.14;

    AreaCirc(Double raioInicial) {
        raio = raioInicial;
        pi = 3.14;
    }

    Double area(){
        return pi * Math.pow(raio, 2);
    }
}
