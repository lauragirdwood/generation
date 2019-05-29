import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Exercício 01 - Aumento Salarial
//        int ano = 1995;
//        double salario = 1000.00;
//        double percentualAumento = 0.0;
//
//        System.out.println("Ano: "+ano+" Salario: "+salario+" Percentual: "+percentualAumento);
//
//        for (ano = 1996; ano <= 2019; ano++) {
//
//            if (ano == 1996) {
//                percentualAumento = 0.015;
//                salario += salario * percentualAumento;
//                System.out.println("Ano: "+ano+" Salario: "+salario+" Percentual: "+percentualAumento);
//            } else if (ano > 1996) {
//                percentualAumento = percentualAumento * 2;
//                salario += salario * percentualAumento;
//                System.out.println("Ano: " + ano + " Salario: " + salario + " Percentual: " + percentualAumento);
//            }
//
//        }


        // Exercício 04
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

        // Exercício 09
//        int soma = 0;
//
//        for(int i = 2; i <= 100; i+=2) {
//            soma += i;
//        }
//
//        System.out.println(soma);

        // Exercício 10
//        Scanner leitor = new Scanner(System.in);
//        int numeroTeste = 0;
//        boolean ehPrimo = true;
//
//        System.out.println("Digite um numero: ");
//        numeroTeste = leitor.nextInt();
//
//        // incrementa de dois em dois a partir de 3 pq todos os números primos além do 2 são ímpares
//        for (int divisor = 2; divisor < numeroTeste; divisor++) {
//            if (numeroTeste % divisor == 0) {
//                System.out.println("O numero eh divisivel por "+divisor);
//                ehPrimo = false;
//                break;
//            }
//        }
//
//        if (ehPrimo){
//            System.out.println("O numero eh primo");
//        } else {
//            System.out.println("O numero nao eh primo");
//        }


        // Lista Arrays
        // Exercício 01
        Scanner leitor = new Scanner(System.in);
        int[] arrayTeste = new int[3];
        boolean ehPrimo = true;

        // preenche o array
        for(int i = 0; i <= arrayTeste.length; i++) {
            System.out.println("Digite um numero: ");
            arrayTeste[i] = leitor.nextInt();

            for(int j = 2; j < arrayTeste[i]; j++){ // ve se é primo

                if (arrayTeste[i] % j == 0) {
                    System.out.println("O numero eh divisivel por "+j);
                    break;
                } else if(arrayTeste[i] / j == 1) {
                    System.out.println("Eh primo");
                    System.out.println(i);
                    System.out.println(arrayTeste[i]);
                }
            }
        }

//        // testa os elementos do array pra ver se são primos
//        for (int contador = 0; contador <= arrayTeste.length; contador++) {
//            int divisor = 2;
//            if (arrayTeste[contador] % divisor == 0) {
//                System.out.println("O numero eh divisivel por "+contador);
//                ehPrimo = false;
//                break;
//            } else {
//                System.out.println("Numeros primos: ");
//                System.out.println("indice: "+contador);
//                System.out.println("valor: "+arrayTeste[contador]);
//                divisor++;
//            }
//        }
//
//        if (ehPrimo){
//            System.out.println("O numero eh primo");
//        } else {
//            System.out.println("O numero nao eh primo");
//        }




    }
}