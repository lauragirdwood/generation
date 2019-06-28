import java.util.*;

public class Main {

    int tamanho = 5;

    public boolean canWin(int leap, int game[tamanho]) {
        // Return true if you can win the game; otherwise, return false.
        int posAtual = 0, posFinal = 5;
        for (int i = 0; i < game.length; i++) {
            if (i < posFinal && i + leap < posFinal) {
                if ( game[i + 1] == 0) {
                    posAtual = i + 1;
                } else if (game[i + 1] >= posFinal) {
                    posAtual = posFinal;
                    break;
                } else if (game[i + leap] == 0) {
                    posAtual = i + leap;
                } else if (game[i + leap] >= posFinal) {
                    posAtual = posFinal;
                    break;
                }
            }
        }
        if (posAtual == posFinal) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
