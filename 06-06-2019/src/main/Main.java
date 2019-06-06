package main;

import modelo.Cliente;
import modelo.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente jaiminho = new Cliente(92, "Jaime", "8327482734-3", "23478324-32");

        ContaPoupanca contaPoupancaDoJaiminho = new ContaPoupanca(2000.00, jaiminho, 0.03);

        System.out.println("O seu saldo é de R$" + contaPoupancaDoJaiminho.consultarSaldo());
        System.out.println("O seu saldo após o saque é de R$" + contaPoupancaDoJaiminho.sacar(200.00));
        contaPoupancaDoJaiminho.depositar(500);
        System.out.println("O seu saldo após o depósito é de R$" + contaPoupancaDoJaiminho.consultarSaldo());


    }
}
