package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {


        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "db_vendasbolos";
        String user = "root";
        String password = "admin";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionURL = sb.toString();   // "jdbc:mysql://localhost/db_vendasbolos"

        {
            try (Connection conn = DriverManager.getConnection(connectionURL, user, password)){
                System.out.println("SUCESSO");
            } catch (SQLException e) {
                System.out.println("FALHA");
                e.printStackTrace();
            }

        }
    }

}


