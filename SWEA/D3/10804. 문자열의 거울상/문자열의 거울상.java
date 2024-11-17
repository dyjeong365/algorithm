import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        Map<Character, Character> map = new HashMap<>();

        map.put('b', 'd');
        map.put('d', 'b');
        map.put('p', 'q');
        map.put('q', 'p');

        for (int i = 0; i < T; i++) {

            sb.append("#")
                    .append(i + 1)
                    .append(" ");

            char[] input = br.readLine().toCharArray();

            for (int j = input.length - 1; j >= 0; j--) {
                sb.append(map.get(input[j]));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
