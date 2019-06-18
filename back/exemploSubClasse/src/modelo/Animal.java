package modelo;

public class Animal {

    private String nome;
    private Integer idade;
    private String especie;
    private char sexo; // F fêmea e M macho

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Animal() {
    }

    public Animal(String nome, Integer idade, String especie, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.sexo = sexo;
    }

    public boolean animalEhMamifero(){
        return false;
    }

}
