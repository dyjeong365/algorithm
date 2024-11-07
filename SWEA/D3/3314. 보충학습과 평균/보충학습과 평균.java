import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            double sum = 0.0;

            while (st.hasMoreTokens()) {
                int score = Integer.parseInt(st.nextToken());

                sum += score > 40 ? score : 40;
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append((int) (sum / 5))
                    .append("\n");
        }

        System.out.print(sb);
    }
}
