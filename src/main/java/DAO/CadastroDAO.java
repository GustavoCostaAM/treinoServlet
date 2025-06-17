package DAO;
import Model.*;

import java.sql.*;

public class CadastroDAO {
    public boolean cadastrarUsuario(Empregado empregado){
        try{
            //criando codigo SQL
            String sql = "insert into usuario(nome, idade, email, senha) values (?, ?, ?, ?)";

            //criando statement
            Database database = new Database();
            Connection connection = database.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            //preprarando os unknows do script sql
            statement.setString(1, empregado.getNome());
            statement.setInt(2, empregado.getIdade());
            statement.setString(3, empregado.getEmail());
            statement.setString(4, empregado.getSenha());

            //enviando o query
            statement.executeUpdate();

            return true;

        }catch (SQLException sqle){
            System.out.println("Erro ao criar statement: " + sqle.getMessage());
            System.out.println("Erro: " + sqle.getErrorCode());
        }
        return false;
    }

}
