import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (char el : br.readLine().toCharArray()) {
            sb.append(el - 'A' + 1).append(" ");
        }

        System.out.print(sb);
    }
}
