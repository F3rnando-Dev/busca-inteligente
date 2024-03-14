/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busca.inteligente.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ferna
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/buscainteligente?characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            
            Connection conn = DriverManager.getConnection(URL, USER,PASSWORD);
            return conn;
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão "+ex);
        }
    }
    
    public static void closeConnection(Connection conn){
        try{
            if(conn != null){
                conn.close();
            }
        } catch (SQLException ex){
            throw new RuntimeException("Problem na exception "+ex);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        closeConnection(conn);
        
        try{
            if(stmt != null){
            stmt.close();
        }   
        } catch (SQLException ex){
            throw new RuntimeException("Problem  na exception "+ex);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(conn, stmt);
        
        try{
            if(rs != null){
            rs.close();
        }   
        } catch (SQLException ex){
            throw new RuntimeException("Problem na exception "+ex);
        }
    }
    
}
