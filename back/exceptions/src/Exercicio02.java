import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {

        try {
            //List<String> animais = null;
            List<String> animais = new ArrayList<>();

            animais.add("Pato");
            animais.add("Cachorro");
            animais.add("Gato");

            //System.out.println(animais.get(2));
            System.out.println(animais.get(5));
            
        } catch (NullPointerException e){
            System.out.println("Caiu na exceção 1");
            e.printStackTrace();
        }

    }
}
