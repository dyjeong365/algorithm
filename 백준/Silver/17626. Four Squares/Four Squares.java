import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int MAX = 50_000;
    static final int[] DP = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        DP[1] = 1;

        for (int i = 2; i < MAX + 1; i++) {
            DP[i] = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                // DP[1^2] = DP[2^2] = DP[3^2] = 1
                // DP[2] = DP[1^2 + 1^2] = DP[1^2] + DP[1^2] = 2
                // DP[8] = DP[2^2 + 2^2] = DP[2^2] + DP[2^2] = 2
                DP[i] = Integer.min(DP[i], DP[i - j * j] + 1);
            }
        }

        System.out.print(DP[n]);
    }
}
