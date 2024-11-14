import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = 10;

        for (int i = 0; i < T; i++) {
            sb.append("#")
                    .append(br.readLine())
                    .append(" ");

            String target = br.readLine();
            String sentence = br.readLine();
            int start = 0;
            int end = start + target.length();
            int res = 0;

            while (end <= sentence.length()) {
                if (target.equals(sentence.substring(start, end))) {
                    res++;
                }

                start++;
                end++;
            }

            sb.append(res)
                    .append("\n");
        }

        System.out.print(sb);
    }
}
