import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

    public static void main(String[] args) {

        List<String> listaVazia = new ArrayList<>();

        listaVazia.add(0, "Pato");
        listaVazia.add("Cachorro");
        listaVazia.add("Gato");
        try {

            System.out.println(listaVazia.get(3));
        } catch (Exception e) {
            System.out.println("Caiu na exceção");
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
