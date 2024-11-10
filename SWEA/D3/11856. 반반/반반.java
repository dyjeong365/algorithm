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

        for (int i = 0; i < T; i++) {
            Map<Character, Integer> map = new HashMap<>();

            for (char pos : br.readLine().toCharArray()) {
                map.put(pos, map.getOrDefault(pos, 0) + 1);
            }

            sb.append("#")
                    .append(i + 1)
                    .append(" ");

            boolean flag = true;

            for (int cnt : map.values()) {
                if (cnt != 2) {
                    flag = false;
                    break;
                }
            }

            sb.append(flag ? "Yes" : "No")
                    .append("\n");
        }

        System.out.print(sb);
    }

}
