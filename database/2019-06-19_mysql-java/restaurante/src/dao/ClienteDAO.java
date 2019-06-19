package dao;

import connection.ConnectionFactory;
import model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

        private Connection connection;

        public ClienteDAO() {
            this.connection = new ConnectionFactory().getConnection();
        }

        // CREATE
        public void adiciona (Cliente cliente) {
            try {
                String sql = "INSERT INTO cliente (id_cliente, nome) VALUES (?, ?)";

                PreparedStatement stmt = this.connection.prepareStatement(sql);

                stmt.setInt(1, cliente.getId());
                stmt.setString(2, cliente.getNome());

                stmt.execute();
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        // READ
        public List<Cliente> lista(){
            try{
                List<Cliente> clientes = new ArrayList<>();
                PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM cliente");
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("id_cliente"));
                    cliente.setNome((rs.getString("nome")));
                    clientes.add(cliente);
                }
                rs.close();
                stmt.close();
                return clientes;
            } catch (SQLException e) {
               throw new RuntimeException(e);
            }
        }
}

