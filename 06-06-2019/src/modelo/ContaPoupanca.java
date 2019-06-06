package modelo;

public class ContaPoupanca extends Conta {

    private double taxaDeJuros;

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaPoupanca(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaPoupanca(double saldo, Cliente cliente, double taxaDeJuros) {
        super(saldo, cliente);
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(getSaldo() + valor);
        System.out.println(getSaldo() + " " + valor);
    }

    @Override
    public void sacar(double valor) {
        this.setSaldo(getSaldo() - valor);
        System.out.println(getSaldo() + " " + valor);
    }

    @Override
    public double consultarSaldo() {
        return this.getSaldo();
    }

    public void recolherJuros(){
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.getTaxaDeJuros()));
        System.out.println("novoSaldo após correção: " + this.getSaldo() + " taxa: " + this.getTaxaDeJuros());
    }
}
