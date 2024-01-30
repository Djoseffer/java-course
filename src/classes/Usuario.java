package classes;

public class Usuario {
    String nome;
    String email;

    /*@Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            return super.equals(objeto);
        } else {
            return false;
        }
    } */

    @Override
    public boolean equals(Object objeto) {

        Usuario outro = (Usuario) objeto;

        boolean nomeIgual = outro.nome.equals(this.nome) ;
        boolean emailIgual = outro.email.equals(this.email);
        return nomeIgual && emailIgual;

    }
}
