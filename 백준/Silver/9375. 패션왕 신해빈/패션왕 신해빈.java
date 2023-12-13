import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int answer = 1;
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                String[] input = br.readLine().split(" ");
                map.put(input[1], map.getOrDefault(input[1], 0) + 1);
            }

            for (int count : map.values()) {
                answer *= (count + 1);
            }

            answer -= 1;
            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}
