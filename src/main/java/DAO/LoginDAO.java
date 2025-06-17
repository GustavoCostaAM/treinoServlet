package DAO;

import Model.Empregado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public boolean logarUsuario(Empregado empregado){
        //variaveis
        ResultSet resultSet;

        try{
            //criando codigo sql
            String sql = "select email, senha from usuarios where email = ?";

            //criando PreparedStatement
            Database database = new Database();
            PreparedStatement statement = database.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery(sql);

            //verificando se há algum usuario
            while (resultSet.next()){ //só funciona se tiver algum email
                if (resultSet.getString("senha").equals(empregado.getSenha())){
                    return true;
                }
            }
        }catch (SQLException sqle){
            System.out.println("Erro ao criar statement");
            System.out.println(sqle.getMessage());
            System.out.println(sqle.getErrorCode());
        }
        return false;
    }
}
