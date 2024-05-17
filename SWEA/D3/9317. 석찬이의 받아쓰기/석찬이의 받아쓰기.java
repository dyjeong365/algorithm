import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            final int N = Integer.parseInt(br.readLine());
            final String input = br.readLine();
            final String wrongInput = br.readLine();
            int result = 0;

            for (int j = 0; j < N; j++) {
                if (input.charAt(j) == wrongInput.charAt(j)) {
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


