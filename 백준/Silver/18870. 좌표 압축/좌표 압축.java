import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());
        int[] coordinates = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            coordinates[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(coordinates[i], 0);
        }

        int[] copyOfCoordinates = Arrays.stream(coordinates).distinct().sorted().toArray();

        for (int j = 0; j < map.size(); j++) {
            map.put(copyOfCoordinates[j], j);
        }

        for (int el : coordinates) {
            sb.append(map.get(el))
                    .append(" ");
        }

        System.out.print(sb);
    }
}
