package modelo.exercicio04;

public class Tripe {

    private boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(int novaAltura) {
        this.alturaAtual = novaAltura;
    }

    public void dobrar() {
        if (!isDobrado()){
            this.dobrado = true;
            if (alturaAtual != alturaMinima) {
                this.alturaAtual = this.alturaMinima;
            }
            System.out.println("Dobrei!");
        }
    }

    public void desdobrar() {
        if (isDobrado()){
            this.dobrado = false;
            this.alturaAtual = this.alturaMaxima;
            System.out.println("Desdobrei!");
        }
    }

    public boolean prontoParaGuardar() {
        if (this.alturaAtual == this.alturaMinima && this.dobrado) {
            return true;
        } else {
            return false;
        }
    }

    public void guardar(){
        if (prontoParaGuardar()){
            System.out.println("Guardei!");
        } else {
            System.out.println("Dobra, imbecil!");
        }
    }

    public boolean prontoParaUsar(){
        if (!isDobrado() && alturaAtual > (alturaMaxima/2)){
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


}
