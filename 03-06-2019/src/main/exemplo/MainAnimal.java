package main.exemplo;

import modelo.exemplo.Animal;

public class MainAnimal {

    public static void main(String[] args) {

        // instanciando um animal
        Animal coke = new Animal("Coke", 4, "Roseli");
//        coke.setNome("Coke");
//        coke.setIdade(4);
        System.out.println("Nome: "+coke.getNome());
        System.out.println("Idade: "+coke.getIdade());

        // instanciando outro animal
        Animal fitsy = new Animal("Fitsy", 13, "Laura");
//        fitsy.setNome("Fitsy");
//        fitsy.setIdade(13);
        System.out.println("Nome: "+fitsy.getNome());
        System.out.println("Idade: "+fitsy.getIdade());

        // instanciando outro animal
        Animal ana = new Animal("Ana", 25);

        // instanciando animal só com nome
        Animal disgrassa = new Animal("Digrassa");

        // instanciando animal sem nada
        Animal dudu = new Animal();

        dudu.setNome("Dudu");
        dudu.setIdade(4);
        dudu.setDono("Vitor");

    }
}
