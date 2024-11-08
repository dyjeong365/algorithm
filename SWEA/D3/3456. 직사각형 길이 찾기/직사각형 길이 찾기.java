import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = toInt(input[0]);
            int b = toInt(input[1]);
            int c = toInt(input[2]);

            sb.append("#")
                    .append(i + 1)
                    .append(" ");
            if (a == b) {
                sb.append(c);
            } else if (a == c) {
                sb.append(b);
            } else {
                sb.append(a);
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }

    private static int toInt(String input) {
        return Integer.parseInt(input);
    }
}
