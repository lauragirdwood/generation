package modelo;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public ContaCorrente(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public ContaCorrente(double saldo, Cliente cliente, double limiteChequeEspecial) {
        super(saldo, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
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
}
