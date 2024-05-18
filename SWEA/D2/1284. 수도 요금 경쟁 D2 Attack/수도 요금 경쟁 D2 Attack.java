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
            st = new StringTokenizer(br.readLine());
            final int P = Integer.parseInt(st.nextToken());
            final int Q = Integer.parseInt(st.nextToken());
            final int R = Integer.parseInt(st.nextToken());
            final int S = Integer.parseInt(st.nextToken());
            final int W = Integer.parseInt(st.nextToken());
            final int A = P * W;

            /** B사
             * R리터 이하 요금: Q
             * R리터 초과 요금: Q + (W - R) * S
             */
            final int B = W - R > 0 ? Q + (W - R) * S : Q;

            int result = Math.min(A, B);

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(result)
                    .append("\n");
        }

        System.out.print(sb);
    }
}

