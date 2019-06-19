package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Design Pattern Connection Factory
    public Connection getConnection() {
        try {
            return DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/restaurante?serverTimezone=GMT-3", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e); // return exception
        }
    }
}
