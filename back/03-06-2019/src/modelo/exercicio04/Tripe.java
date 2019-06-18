package modelo.exercicio04;

public class Tripe {

    private boolean dobrado;
    private double alturaMinima;
    private double alturaMaxima;
    private double alturaAtual;

    // Setters & Getters
    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(double alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    // Construtores
    public Tripe() {
    }

    public Tripe(boolean dobrado, double alturaMinima, double alturaMaxima, double alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }

    // Métodos
    public void definirAltura(double novaAltura) {
        this.alturaAtual = novaAltura;
    }

    // MENOS É MAIS !!!!
    public void dobrar() {
        //if (!isDobrado()){
            this.dobrado = true;
           // if (alturaAtual != alturaMinima) {
           //     this.alturaAtual = this.alturaMinima;
           // }
            System.out.println("Dobrei!");
        //}
    }

    // MENOS É MAIS !!!!
    public void desdobrar() {
        //if (isDobrado()){
            this.dobrado = false;
            // this.alturaAtual = this.alturaMaxima;
            System.out.println("Desdobrei!");
        //}
    }

    public void guardar(){
        if (prontoParaGuardar()){
            System.out.println("Guardei!");
        } else {
            System.out.println("Primeiro dobra, imbecil!");
        }
    }

    public boolean prontoParaGuardar() {
        if (this.alturaAtual == this.alturaMinima && this.dobrado) {
            return true;
        } else {
            return false;
        }
    }

    public void usar(){
        if(prontoParaUsar()){
            System.out.println("Então usa, porra!");
            System.out.println("s2");
        } else {
            System.out.println("Não dá pra usar não essa caralha!");
        }
    }

    public boolean prontoParaUsar(){
        if (!this.dobrado && alturaAtual > (alturaMaxima/2)){
            return true;
        } else {
            return false;
        }
    }

}
