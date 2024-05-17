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

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(N * N)
                    .append("\n");
        }

        System.out.print(sb);
    }
}


