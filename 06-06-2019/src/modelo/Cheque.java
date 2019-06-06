package modelo;

public class Cheque {

    private double valor;
    private String bancoEmissor;
    private String dataPagto;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public Cheque(double valor, String bancoEmissor, String dataPagto) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPagto = dataPagto;
    }
}
