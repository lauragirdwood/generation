public class Exercicio01 {
    public static void main(String[] args) {

        int ano;
        double salarioInicial, salarioAtual, percentual;

        ano = 1995;
        salarioInicial = 1000.00;
        salarioAtual = 1000.00;
        percentual = 0;

        // Em 1995
        System.out.println("Ano: "+ano+" - Salário: "+salarioInicial+" - Percentual de aumento: "+percentual * 100+"%");

        ano++;
        percentual = 0.015;
        salarioAtual += (salarioInicial * percentual);

        //Em 1996
        System.out.println("Ano: "+ano+" - Salário: "+salarioAtual+" - Percentual de aumento: "+percentual * 100+"%");

        //A partir de 1997
        do {
            percentual = percentual * 2;
            salarioAtual += salarioInicial * percentual;
            System.out.println("Ano: "+ano+" - Salário: "+salarioAtual+" - Percentual de aumento: "+percentual * 100+"%");
            ano++;
        } while(ano < 2020);

    }
}
