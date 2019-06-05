package modelo;

public class Cachorro extends Animal{

    private boolean temPelo;

    // getters & setters
    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    // construtor
    public Cachorro(boolean temPelo) {
        this.temPelo = temPelo;
    }

    public Cachorro(String nome, Integer idade, String especie, char sexo, boolean temPelo) {
        super(nome, idade, especie, sexo);
        this.temPelo = temPelo;
    }

    // métodos
    public void latir(){
        System.out.println("au au");
    }

    @Override
    public boolean animalEhMamifero(){
        return true;
    }

}
