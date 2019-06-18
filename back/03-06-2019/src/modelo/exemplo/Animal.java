package modelo.exemplo;

public class Animal {

    private String nome;
    private int idade;
    private String dono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Animal(){
    }

    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Animal(String nome, int idade, String dono){
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    public boolean ehMamifero(){
        return true;
    }

}
