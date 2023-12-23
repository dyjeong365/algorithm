import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static StringBuilder sb;
    static char[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 4 * Integer.parseInt(br.readLine()) - 3;
        star = new char[N][N];
        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            Arrays.fill(star[i], ' ');
        }

        makeStar(0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(star[i][j]);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    private static void makeStar(int start, int len) {
        if (len <= start) {
            return;
        }

        for (int i = start; i < len; i++) {
            star[start][i] = '*';
            star[len - 1][i] = '*';
            star[i][start] = '*';
            star[i][len - 1] = '*';
        }

        makeStar(start + 2, len - 2);
    }
}
