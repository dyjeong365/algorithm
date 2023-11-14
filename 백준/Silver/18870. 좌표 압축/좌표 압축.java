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
        Map<Integer, Integer> map = new HashMap<>();
        int theNumberOfSmallerValue = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            coordinates[i] = Integer.parseInt(st.nextToken());
        }

        int[] copyOfCoordinates = Arrays.copyOf(coordinates, coordinates.length);

        Arrays.sort(copyOfCoordinates);

        for (int j = 0; j < N; j++) {
            if (!map.containsKey(copyOfCoordinates[j])) {
                map.put(copyOfCoordinates[j], theNumberOfSmallerValue++);
            }
        }

        for (int el : coordinates) {
            sb.append(map.get(el))
                    .append(" ");
        }

        System.out.print(sb);
    }
}
