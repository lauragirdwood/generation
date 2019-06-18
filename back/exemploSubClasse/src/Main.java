import modelo.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro tobias = new Cachorro("Fritz");

        tobias.setNome("Tobias");
        tobias.setIdade(2);

        if (tobias.getIdade() > 1) {
            System.out.println("Não é mais um filhote");
        }

        System.out.println(tobias.animalEhMamifero());
    }
}
