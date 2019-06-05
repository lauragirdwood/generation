package modelo.exercicio05;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String contato;

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    // Contrutor
    public Cliente(String nome, String sobrenome, String contato) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
    }
}
