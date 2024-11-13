import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            final int N = Integer.parseInt(input[0]);
            final int M = Integer.parseInt(input[1]);
            int[] sum = new int[401];

            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= M; k++) {
                    sum[j + k]++;
                }
            }

            int max = Integer.MIN_VALUE;

            for (int pos : sum) {
                max = Math.max(max, pos);
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ");

            for (int k = 2; k < sum.length; k++) {
                if (sum[k] == max) {
                    sb.append(k)
                            .append(" ");
                }
            }

            sb.deleteCharAt(sb.length() - 1)
                    .append("\n");
        }

        System.out.print(sb);
    }
}
