package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioUpdate {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o ID");
        int codigo = entrada.nextInt();

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet r = stmt.executeQuery();

        if (r.next()) {
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
            System.out.println("O nome atual é " + p.getNome());
            entrada.nextLine();

            System.out.print("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Pessoa atualizada com sucesso!");
        } else {
            System.out.println("Nenhuma pessoa foi encontrada. Verifique o ID informado.");
        }
        entrada.close();
    }
}
