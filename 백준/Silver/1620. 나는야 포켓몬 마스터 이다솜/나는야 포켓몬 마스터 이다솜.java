import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] count = br.readLine().split(" ");
        final int N = Integer.parseInt(count[0]);
        final int M = Integer.parseInt(count[1]);
        Map<String, Integer> stringIntegerMap = new LinkedHashMap<>();
        String[] keySet = new String[N + 1];

        for (int i = 0; i < N; i++) {
            String pockemon = br.readLine();
            stringIntegerMap.put(pockemon, i + 1);
            keySet[i + 1] = pockemon;
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            if (input.matches("\\d+")) {
                int idx = Integer.parseInt(input);
                sb.append(keySet[idx]);
            } else {
                sb.append(stringIntegerMap.get(input));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
