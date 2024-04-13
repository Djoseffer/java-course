package generics;

public class Caixa<T> {

    //O generics<> normalmente é representado por uma letra,
    // ele recebe um tipo quando for criado uma herença ou instanciado
    private T coisa;

    public void aguardar(T coisa){
        this.coisa = coisa;
    }
    public T abrir(){
        return coisa;
    }

}
