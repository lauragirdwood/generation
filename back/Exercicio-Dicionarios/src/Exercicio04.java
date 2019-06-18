import modelo.Ex04GuardaVolumes;
import modelo.Ex04Peca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio04 {

    public static void main(String[] args) {

        //masculino
        Ex04Peca camiseta = new Ex04Peca("Renner", "Avengers");
        Ex04Peca bermuda = new Ex04Peca("Adidas", "Listrada");

        //feminino
        Ex04Peca brusinha = new Ex04Peca("Adidas", "Sport");
        Ex04Peca vestido = new Ex04Peca("Farm", "Casual");

        List<Ex04Peca> masculino = new ArrayList<>();
        masculino.add(camiseta);
        masculino.add(bermuda);

        List<Ex04Peca> feminino = new ArrayList<>();
        feminino.add(brusinha);
        feminino.add(vestido);

        Map<Integer, List<Ex04Peca>> pecas = new HashMap<>();
        pecas.put()

        Ex04GuardaVolumes guardaVolumes = new Ex04GuardaVolumes(0)





    }

}
