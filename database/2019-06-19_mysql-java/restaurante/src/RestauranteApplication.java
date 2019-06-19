

import dao.ClienteDAO;
import model.Cliente;

public class RestauranteApplication {

    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();

        Cliente laura = new Cliente();
        laura.setId(5);
        laura.setNome("Laura");

        clienteDAO.adiciona(laura);

        System.out.println(clienteDAO.lista());

    }
}
