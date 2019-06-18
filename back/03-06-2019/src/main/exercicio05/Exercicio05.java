package main.exercicio05;

import modelo.exercicio05.Cliente;
import modelo.exercicio05.Concessionaria;
import modelo.exercicio05.Veiculo;

public class Exercicio05 {

    public static void main(String[] args) {

        Veiculo veiculo01 = new Veiculo("Ford", "Fiesta", 1998, "vermeleho", 20000);
        Cliente cliente01 = new Cliente("Jorge", "Ferreira", "(11) 98888-8888");
        Concessionaria concessionaria = new Concessionaria();

        concessionaria.registrarVenda(cliente01, veiculo01, 1200.00);

        System.out.println();

    }
}
