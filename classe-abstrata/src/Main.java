import abstracts.Catiorro;
import modelos.Gerente;

public class Main {

    public static void main(String[] args) {
        Catiorro catiorineo = new Catiorro();
        catiorineo.comer();
        catiorineo.respirar();

        // Gerente 1
        Gerente joao = new Gerente();
        joao.setNome("João");

        // Gerente 2
        Gerente maria = new Gerente();
        maria.setNome("João");

        if (joao.equals(maria)){
            System.out.println("Eles são iguais");
        } else {
            System.out.println("Eles não iguais");
        }

        if (joao.hashCode() == maria.hashCode()){
            System.out.println("Eles são iguais");
        } else {
            System.out.println("Eles não são iguais");
        }

    }
}
