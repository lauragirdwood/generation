import connection.ConnectionFactory;

import java.sql.*;

public class Insert {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;
       //ResultSet rs = null;

        try {
            // Design Pattern Singleton
            con = new ConnectionFactory().getConnection();

            String sql = "INSERT INTO cliente (id_cliente, nome) VALUES (?, ?)";

            stmt = con.prepareStatement(sql);

            stmt.setInt(1, 3);
            stmt.setString(2, "Rebeca");

            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
               // rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
