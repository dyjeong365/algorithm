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
            int result = 0;

            for (int j = 1; j <= N; j++) {
                result += j % 2 == 0 ? -j : j;
            }

            sb.append("#" + (i + 1) + " " + result + "\n");
        }

        System.out.print(sb);
    }
}


