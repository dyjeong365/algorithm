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

        for (int i = 0; i < N; i++) {
            stringIntegerMap.put(br.readLine(), i + 1);
        }

        String[] keySet = stringIntegerMap.keySet().stream().toArray(String[]::new);

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            if (input.matches("\\d+")) {
                int value = Integer.parseInt(input);
                sb.append(keySet[value - 1]);
            } else {
                sb.append(stringIntegerMap.get(input));
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}
