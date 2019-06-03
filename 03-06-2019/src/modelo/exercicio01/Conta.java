package modelo.exercicio01;

public class Conta {

    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(){
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int numeroConta, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void deposito(double valorDeposito) {
        System.out.println("Houve um depósito de "+valorDeposito);
        this.saldo += valorDeposito;
    }

    public void saque(double valorSaque) {

        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println("Houve um saque de "+valorSaque);
        } else {
            System.out.println("Houve uma tentativa de saque no valor de "+valorSaque);
            System.out.println("Saldo insuficiente! Você só tem " + this.saldo);
        }

    }
}
