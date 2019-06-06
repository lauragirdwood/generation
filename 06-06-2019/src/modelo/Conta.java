package modelo;

public abstract class Conta {

    private double saldo;
    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta() {

    }

    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public abstract void depositar(double valor);

    public abstract double sacar(double valor);

    public abstract double consultarSaldo();

}
