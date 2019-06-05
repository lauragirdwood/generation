package abstracts;

public abstract class Animal {

    protected String nome;
    protected Integer idade;
    protected String especie;
    public char sexo; // 'F' ou 'M'

    public abstract void respirar();

    public abstract void comer();



}
