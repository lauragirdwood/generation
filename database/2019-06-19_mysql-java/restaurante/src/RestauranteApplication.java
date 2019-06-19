

import dao.ClienteDAO;
import model.Cliente;

public class RestauranteApplication {

    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();

        Cliente joana = new Cliente();
        joana.setId(6);
        joana.setNome("Joana");

        clienteDAO.adiciona(joana);

        System.out.println(clienteDAO.lista());

    }
}
