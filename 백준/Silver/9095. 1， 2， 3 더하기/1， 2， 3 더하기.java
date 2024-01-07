import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int MAX = 11;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        int[] dp = new int[MAX];
        dp[1] = 1; // {1}
        dp[2] = 2; // {1 + 1, 2}
        dp[3] = 4; // {1 + 1 + 1, 1 + 2, 2 + 1, 3}

        for (int i = 4; i < MAX; i++) {
            /*
            dp[i - 1]의 방법들에서 '+1'을 하면 dp[i]의 값
            dp[i - 2]의 방법들에서 '+2'을 하면 dp[i]의 값
            dp[i - 3]의 방법들에서 '+3'을 하면 dp[i]의 값
             */
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }

        System.out.print(sb);
    }
}
