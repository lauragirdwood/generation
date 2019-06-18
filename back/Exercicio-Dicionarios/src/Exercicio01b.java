import java.util.*;

public class Exercicio01b {
    public static void main(String[] args) {

        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");
        apelidos.put("João", apelidosJoao);

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Juan");
        apelidosMiguel.add("Fissura");
        apelidosMiguel.add("Maromba");
        apelidos.put("João", apelidosMiguel);

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Juan");
        apelidosMaria.add("Fissura");
        apelidosMaria.add("Maromba");
        apelidos.put("João", apelidosMaria);

        apelidos.put("Miguel", Collections.singletonList("Night Watch, Bruce Wayne, Tampinha"));
        apelidos.put("Maria", Collections.singletonList("Wonder Woman, Mary, Marilene"));
        apelidos.put("Lucas", Collections.singletonList("Lukinha, Jorge, George"));

        for (String chave : apelidos.keySet()) {
            System.out.println(chave + " seus apelidos são: " + apelidos.get(chave));
        }

    }
}
