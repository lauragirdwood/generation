/*
1. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o
seu antecessor e seu sucessor.
*/

package Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NumeroInteiro laura = new NumeroInteiro(10);

//        int varNumero;
//        System.out.println("Digite um laura inteiro: ");
//        Scanner leitor = new Scanner(System.in);
//        varNumero = leitor.nextInt();

        laura.AnteriorSucessor(laura.getNumero());

    }

}
