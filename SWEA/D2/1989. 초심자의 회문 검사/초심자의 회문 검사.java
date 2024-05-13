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
            int result = 1;
            int start = 0;
            int end = input.length() - 1;

            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    result = 0;
                }

                start++;
                end--;
            }

            sb.append("#" + (i + 1) + " " + result + "\n");
        }

        System.out.print(sb);
    }
}


