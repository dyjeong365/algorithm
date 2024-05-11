import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                sb.append(i)
                        .append(" ");
            }
        }

        System.out.print(sb);
    }
}
