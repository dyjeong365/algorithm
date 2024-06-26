import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input = Integer.parseInt(br.readLine());

        while (input > 0) {
            sb.append(input--)
                    .append(" ");
        }

        sb.append(input);
        System.out.print(sb);
    }
}
