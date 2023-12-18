import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        final int MAX = 30;
        int[][] dp = new int[MAX][MAX];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            // 0 < N <= M < 30
            final int N = Integer.parseInt(st.nextToken());
            final int M = Integer.parseInt(st.nextToken());

            // ((n == r) || (r == 0))
            for (int j = 0; j < MAX; j++) {
                dp[j][j] = 1;
                dp[j][0] = 1;
            }

            // nCr = n-1Cr-1 + n-1Cr
            for (int n = 2; n < MAX; n++) {
                for (int r = 1; r < MAX; r++) {
                    dp[n][r] = dp[n - 1][r - 1] + dp[n - 1][r];
                }
            }

            sb.append(dp[M][N]).append("\n");
        }

        System.out.print(sb);
    }
}
