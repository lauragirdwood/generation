package modelo.exercicio03;

public class Prova {

    private int dificuldade;
    private int energiaNecessaria;

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    //métodos
    public boolean podeRealizar(Atleta atleta) {
        if (atleta.getNivel() >= this.dificuldade && atleta.getEnergia() >= this.energiaNecessaria) {
            System.out.println("Pode realizar");
            return true;
        } else {
            System.out.println("Não pode realizar");
            return false;
        }
    }

    public Prova(int dificuldade, int energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

}
