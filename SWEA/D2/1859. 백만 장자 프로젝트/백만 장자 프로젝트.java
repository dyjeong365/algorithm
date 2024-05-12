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
            int[] input = new int[N];
            long result = 0;
            int max = 0;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                input[j] = Integer.parseInt(st.nextToken());
            }

            for (int k = N - 1; k >= 0; k--) {
                if (input[k] > max) {
                    max = input[k];
                } else {
                    result += (max - input[k]);
                }
            }

            sb.append("#" + (i + 1) + " " + result + "\n");
        }

        System.out.print(sb);
    }
}
