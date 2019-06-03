package main.exercicio01;
import modelo.exercicio01.Cliente;
import modelo.exercicio01.Conta;

public class Main {

    public static void main(String[] args) {

        Cliente cliente01 = new Cliente("Jorge", "Ferreira");
        Conta conta01 = new Conta(123456, 0.0, cliente01);

        System.out.println("Saldo atual: "+conta01.getSaldo());
        conta01.deposito(400.00);
        System.out.println("Saldo após depósito "+conta01.getSaldo());

        conta01.saque(200.50);
        System.out.println("Saldo após saque: "+conta01.getSaldo());

        conta01.saque(200.50);

        Cliente cliente02 = new Cliente("Laura", "Xavier");
        Conta conta02 = new Conta(654321,0.0, cliente02);

        System.out.println("Saldo atual: "+conta02.getSaldo());
        conta02.deposito(800.00);
        System.out.println("Saldo após depósito "+conta02.getSaldo());

        conta02.deposito(200.00);
        conta02.saque(1000.00);
        System.out.println("Saldo após saque: "+conta02.getSaldo());
    }
}
