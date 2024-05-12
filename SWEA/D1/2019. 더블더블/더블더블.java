import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        int result = 1;

        while (cnt-- >= 0) {
            sb.append(result).append(" ");

            result *= 2;
        }

        System.out.print(sb);
    }
}
