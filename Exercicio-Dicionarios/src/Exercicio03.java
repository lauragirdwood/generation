import modelo.Ex03Prova;

import java.util.HashSet;
import java.util.Set;

public class Exercicio03 {

    public static void main(String[] args) {

        Set<Integer> conjuntoDeInteiros = new HashSet<>();
        conjuntoDeInteiros.add(5);
        conjuntoDeInteiros.add(6);
        conjuntoDeInteiros.add(1);
        conjuntoDeInteiros.add(2);

        Ex03Prova prova = new Ex03Prova();

        prova.somaTotal(conjuntoDeInteiros);


    }

}
