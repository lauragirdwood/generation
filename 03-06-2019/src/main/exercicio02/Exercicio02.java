package main.exercicio02;

import modelo.exercicio02.JogadorDeFutebol;
import modelo.exercicio02.SessaoTreinamento;

public class Exercicio02 {

    public static void main(String args[]){

        JogadorDeFutebol marta = new JogadorDeFutebol("Marta", 100, 100, 1000, 100);
        JogadorDeFutebol formiga = new JogadorDeFutebol("Formiga", 100, 200, 100, 90);

        SessaoTreinamento superTreinamento = new SessaoTreinamento();

        superTreinamento.treinarA(marta);
        superTreinamento.treinarA(formiga);

    }
}
