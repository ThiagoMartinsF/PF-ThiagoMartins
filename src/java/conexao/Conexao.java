package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
        private static final  String URL = "jdbc:mysql://localhost:3306/bonappetite";
        private static final  String USUARIO = "root";
        private static final  String SENHA = "";
        private static final  String driver = "com.mysql.cj.jdbc.Driver";
       
public static java.sql.Connection conectar() {
        java.sql.Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO! Conexao:" + e);
        }
        return conn;
    }
}