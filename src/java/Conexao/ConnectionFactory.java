package Conexao;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Valdeir
 */
public class ConnectionFactory {

    public Connection getConnection() throws Exception {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simulador", "root", "1234");
            return con;         

        } catch (Exception e) {
            throw new Exception("Deu pau", e);
        }
    }
}
