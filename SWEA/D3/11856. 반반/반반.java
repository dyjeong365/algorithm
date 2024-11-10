import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int[] counts = new int[27];

            for (char pos : br.readLine().toCharArray()) {
                counts[pos - 'A']++;
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ");

            boolean flag = true;

            for (int cnt : counts) {
                if (cnt != 2 && cnt != 0) {
                    flag = false;
                    break;
                }
            }

            sb.append(flag ? "Yes" : "No")
                    .append("\n");
        }

        System.out.print(sb);
    }

}
