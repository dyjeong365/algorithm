import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        String[] counts = br.readLine().split(" ");
        int answer = 0;

        final int N = Integer.parseInt(counts[0]);
        final int M = Integer.parseInt(counts[1]);

        for (int i = 0; i < N; i++) {
            stringIntegerMap.put(br.readLine(), 1);
        }

        for (int j = 0; j < M; j++) {
            if (stringIntegerMap.containsKey(br.readLine())) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
