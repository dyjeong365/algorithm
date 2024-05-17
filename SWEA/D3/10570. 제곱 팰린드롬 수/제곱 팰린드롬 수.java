import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            final int A = Integer.parseInt(st.nextToken());
            final int B = Integer.parseInt(st.nextToken());
            int result = 0;

            for (int j = A; j <= B; j++) {
                if (isPalindrome(j)) {
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

    private static boolean isPalindrome(int j) {
        List<Integer> list = Arrays.asList(1, 4, 9, 121, 484);

        return list.contains(j);
    }
}
