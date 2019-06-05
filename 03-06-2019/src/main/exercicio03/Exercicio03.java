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

        Prova ciclismo = new Prova(5, 10);
        Prova salto = new Prova(9,9);
        Prova corrida = new Prova(20, 30);

        // Belo
        ciclismo.podeRealizar(belo);
        salto.podeRealizar(belo);
        corrida.podeRealizar(belo);

        // Fofao
        salto.podeRealizar(fofao);
        ciclismo.podeRealizar(fofao);
        corrida.podeRealizar(fofao);




    }

}
