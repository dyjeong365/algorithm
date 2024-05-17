import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            input = input.replace("a", "");
            input = input.replace("e", "");
            input = input.replace("i", "");
            input = input.replace("o", "");
            input = input.replace("u", "");

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(input)
                    .append("\n");
        }

        System.out.print(sb);
    }
}


