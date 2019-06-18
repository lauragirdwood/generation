package modelo.exercicio01;

public class Cliente {

    private String nome;
    private String sobrenome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(){
        this.sobrenome = sobrenome;
    }

    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

}
