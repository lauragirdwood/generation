package modelo;

public class Ex04Peca {

    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Ex04Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void retirada(){
        System.out.println("Retirada!");
    };

}
