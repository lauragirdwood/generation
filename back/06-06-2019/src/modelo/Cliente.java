package modelo;

public class Cliente {

    private int numero;
    private String nome;
    private String rg;
    private String cpf;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(int numero, String nome, String rg, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
}
