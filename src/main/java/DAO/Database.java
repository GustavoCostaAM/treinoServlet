package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    Connection connection;

    //construtor
    public Database(){
        //definindo credenciais
        String JDBCurl = System.getenv("JDBC_URL");
        String user = System.getenv("JDBC_USER");
        String password = System.getenv("JDBC_PASSWORD");

        //criando a conexão
        try{
            connection = DriverManager.getConnection(JDBCurl, user, password);
        }catch (SQLException sqle){
            System.out.println("Erro ao conectar com o banco de dados");
        }
    }

    //getConnection
    public Connection getConnection(){
        return this.connection;
    }
}
