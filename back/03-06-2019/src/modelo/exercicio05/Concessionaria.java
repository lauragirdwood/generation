package modelo.exercicio05;

public class Concessionaria {

    public Venda registrarVenda(Cliente cliente, Veiculo veiculo, double valor){
        System.out.println("Nova venda registrada");
        return new Venda(cliente, veiculo, valor);
    }

}
