import modelo.Pessoa;

public class Main {

    public static void main(String[] args) {

        try {
            Pessoa pessoa = new Pessoa();

            pessoa.setIdade(20);

            if (pessoa.getIdade() >= 18) {
                System.out.println("Você é maior de idade");
            }

            /*
            Integer  i = 0;

            if (18/i == 18){
                System.out.println("Nunca vai entrar");
            }
            */

        } catch (NullPointerException e) {
            System.out.println("Deu ruim, caiu na exceção");
            e.printStackTrace(); // printa qual que é o erro
            System.out.println(e);
        }
            catch (ArithmeticException e) {
            System.out.println("Deu ruim, caiu na exceção 2");
            e.printStackTrace(); // printa qual que é o erro
            System.out.println(e);

        } finally {
            System.out.println("Código que será sempre executado");
        }

        System.out.println("Continua a execução");
    }
}
