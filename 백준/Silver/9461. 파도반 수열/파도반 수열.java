import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final long T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        final int MAX = 101;
        final long[] P = new long[MAX];
        P[1] = P[2] = P[3] = 1;

        for (int i = 4; i < MAX; i++) {
            P[i] = P[i - 3] + P[i - 2];
        }

        for (int i = 0; i < T; i++) {
            final int N = Integer.parseInt(br.readLine());

            sb.append(P[N]).append("\n");
        }

        System.out.print(sb);
    }
}
