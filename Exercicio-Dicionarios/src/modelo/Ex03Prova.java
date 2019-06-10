package modelo;

import java.util.Set;

public class Ex03Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for(Integer valor : conjuntoDeInteiros) {
            soma = soma + valor;
        }
        System.out.println("Soma: "+soma);
    }
}
