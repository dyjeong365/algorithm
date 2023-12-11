import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final long T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        long[] P = new long[101];
        P[1] = P[2] = P[3] = 1;

        for (long i = 0; i < T; i++) {
            sb.append(calcP(Integer.parseInt(br.readLine()), P)).append("\n");
        }

        System.out.print(sb);
    }

    private static long calcP(final int N, long[] P) {
        if (P[N] == 0) {
            for (int i = 4; i <= N; i++) {
                P[i] = P[i - 3] + P[i - 2];
            }
        }

        return P[N];
    }
}
