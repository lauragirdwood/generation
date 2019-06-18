package modelo.exercicio05;

public class Venda {

    private Cliente cliente;
    private Veiculo veiculo;
    private double valorVenda;

    // Setters & Getters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    //Construtor
    public Venda(Cliente cliente, Veiculo veiculo, double valorVenda) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorVenda = valorVenda;
    }

}
