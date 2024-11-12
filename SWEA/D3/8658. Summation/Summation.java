import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (String num : br.readLine().split(" ")) {
                int sum = 0;

                for (char pos : num.toCharArray()) {
                    sum += pos - '0';
                }

                max = Integer.max(max, sum);
                min = Integer.min(min, sum);
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(max)
                    .append(" ")
                    .append(min)
                    .append("\n");
        }

        System.out.print(sb);
    }
}
