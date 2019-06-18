package modelos;

import interfaces.Funcionario;

public class Gerente extends Pessoa implements Funcionario {

    @Override
    public void calcularSalario() {
        System.out.println("Calculando salário...");
    }
}
