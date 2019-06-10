package modelo;

import java.util.List;
import java.util.Map;

public class Ex04GuardaVolumes {

    private Map<Integer, List<Ex04Peca>> dicionario;
    private Integer contador;

    public Ex04GuardaVolumes(Map<Integer, List<Ex04Peca>> dicionario, Integer contador) {
        this.dicionario = dicionario;
        this.contador = contador;
    }

    public Integer guardarPecas(List<Ex04Peca> listaDeEx04Pecas) {
        this.dicionario.put(this.contador, listaDeEx04Pecas);
        return this.contador += 1;
    }

    public void mostrarPecas() {
        for (Integer item : this.dicionario.keySet()) {
            System.out.println("Item: "+ item + " - " + this.dicionario.get(item));
        }
    }

    public void mostrarPecas(Integer numero){
        for (Integer item : this.dicionario.keySet()) {
            if (numero == item) {
                System.out.println("Item: "+ item + " - " + this.dicionario.get(item));
            }
        }
    }

    public void devolverPecas(Integer numero){
        this.dicionario.remove(numero);
    }



}
