/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {    
       
       String driver = "com.mysql.jdbc.Driver"; 
       String url = "jdbc:mysql://143.106.241.3:3306/cl202242";
       String usuario = "cl202242";
       String senha = "Mm240607*";
       Class.forName(driver);
       return DriverManager.getConnection(url, usuario, senha); 
    }  
}
