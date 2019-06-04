package main.exercicio04;

import modelo.exercicio04.Tripe;

public class Exercicio04 {

    public static void main(String[] args) {

        Tripe pablo = new Tripe();
        pablo.setAlturaAtual(5);
        pablo.setAlturaMinima(2);
        pablo.setAlturaMaxima(8);

        pablo.dobrar();
        pablo.guardar();
        pablo.desdobrar();
        pablo.usar();

    }
}
