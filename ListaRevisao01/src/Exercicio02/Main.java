/*
2. Desenvolva um programa em java que leia o nome e a idade de 3 pessoas
e mostre o nome da pessoa mais velha e o nome da pessoa mais nova.
*/

// A fazer:
// Validações das entradas - número negativo, número por extenso (String)
// Ordenação por ordem alfabética caso idades sejam iguais

package Exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Digite o numero de pessoas: ");

        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        int idade[] = new int[tamanho];
        int auxIdade = 0;
        String nome[] = new String[tamanho];
        String auxNome = "aaa";
        int i = 0;


        // preenche os vetores de nome e idade com entrada do usuário
        for (i = 0; i < tamanho; i++) {
            System.out.println("Digite o nome da "+ (i + 1) + "ª pessoa: ");
            nome[i] = leitor.next();

            System.out.println("Digite a idade da "+ (i + 1) + "ª pessoa: ");
            idade[i] = leitor.nextInt();
        }

        // Lógica da troca de valores com bubble sort
        for (i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {

                if(idade[j] > idade[j + 1]){
                    auxIdade = idade[j];
                    auxNome = nome[j];

                    idade[j] = idade[j + 1];
                    nome[j] = nome[j + 1];

                    idade[j + 1] = auxIdade;
                    nome[j + 1] = auxNome;
                }
            }
        }

        // Imprime todos os valores de nome e idades
        for(i = 0; i < tamanho; i ++){
            System.out.println("Nome: " + nome[i] + "  Idade: " + idade[i]);
        }

        // Imprime o mais novo e o mais velho
        System.out.println("Mais novo: " + nome[0] + " " + idade[0]);
        System.out.println("Mais velho: " + nome[tamanho - 1] + " " + idade[tamanho - 1]);

    }

}
