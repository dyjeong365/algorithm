import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            final int N = Integer.parseInt(br.readLine());
            int[] stairs = new int[N];
            st = new StringTokenizer(br.readLine());
            int up = 0;
            int down = 0;

            for (int j = 0; j < N; j++) {
                stairs[j] = Integer.parseInt(st.nextToken());
            }

            for (int k = 0; k < N - 1; k++) {
                int diff = stairs[k] - stairs[k + 1];

                if (diff < 0) {
                    up = Math.max(up, Math.abs(diff));
                } else {
                    down = Math.max(down, diff);
                }
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(up)
                    .append(" ")
                    .append(down)
                    .append("\n");
        }

        System.out.print(sb);
    }
}

