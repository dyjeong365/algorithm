import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            char alphabet = 'a';
            int res = 0;

            for (char pos : br.readLine().toCharArray()) {
                if (pos == alphabet) {
                    res++;
                } else {
                    break;
                }

                alphabet++;
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(res)
                    .append("\n");
        }

        System.out.print(sb);
    }
}
