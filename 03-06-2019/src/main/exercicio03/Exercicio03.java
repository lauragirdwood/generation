package main.exercicio03;

import modelo.exercicio03.Atleta;
import modelo.exercicio03.Prova;

public class Exercicio03 {

    public static void main(String args[]){

        //Criando dois atletas
        Atleta belo = new Atleta();
        belo.setNome("Belo Lindao");
        belo.setEnergia(10);
        belo.setNivel(5);

        Atleta fofao = new Atleta();
        fofao.setNome("Fofão");
        fofao.setEnergia(9);
        fofao.setNivel(8);

        System.out.println(belo.getNome());
        System.out.println(fofao.getNome());

        Prova prova1 = new Prova(5, 10);
        Prova prova2 = new Prova(9,9);

        prova1.podeRealizar(belo);
        prova2.podeRealizar(fofao);

        prova1.podeRealizar(fofao);
        prova2.podeRealizar(belo);


    }

}
