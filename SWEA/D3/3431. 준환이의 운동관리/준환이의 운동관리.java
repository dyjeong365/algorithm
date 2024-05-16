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
            final int L = Integer.parseInt(st.nextToken());
            final int U = Integer.parseInt(st.nextToken());
            final int X = Integer.parseInt(st.nextToken());

            sb.append("#")
                    .append(i + 1)
                    .append(" ");

            if (X < L) {
                sb.append(L - X);
            } else if (X > U) {
                sb.append(-1);
            } else {
                sb.append(0);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}


