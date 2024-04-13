package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {

        //Pode ser usado o final ou não
        final String url = "jdbc:mysql://localhost";
        final String usuario = "root";
        final  String senha = "root";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso");
        conexao.close();
    }
}