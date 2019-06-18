package Exercicio01;

public class NumeroInteiro {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    void AnteriorSucessor(int numero){
        System.out.println("O antecessor é: " + (numero - 1));
        System.out.println("O sucessor é: " + (numero + 1));
    }

}
