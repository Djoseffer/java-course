package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;

    private String sobrenome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String nomeCompleto(){
        return getNome() + " " + getSobrenome();
    }

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade){
        //Math abs ransforma o valor negativo em positivo.
        novaIdade = Math.abs(novaIdade);

        if (novaIdade >=0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    public String toString(){
        return "Olá sou o " + getNome() + " e tenho " + getIdade() + "anos";
    }
}
