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
            int[] incomes = new int[N];
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                incomes[j] = Integer.parseInt(st.nextToken());
                sum += incomes[j];
            }

            int avg = sum / N;
            int result = 0;

            for (int k = 0; k < N; k++) {
                if (incomes[k] <= avg) {
                    result++;
                }
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(result)
                    .append("\n");
        }

        System.out.print(sb);
    }
}


