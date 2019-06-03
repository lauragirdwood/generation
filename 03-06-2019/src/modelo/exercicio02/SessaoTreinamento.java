package modelo.exercicio02;

public class SessaoTreinamento {

    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogador){
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        jogador.setExperiencia(getExperiencia() + 1);
        
    }
}
