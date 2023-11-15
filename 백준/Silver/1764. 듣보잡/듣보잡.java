import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Boolean> stringBooleanMap = new TreeMap<>();

        String input[] = br.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int M = Integer.parseInt(input[1]);
        int intersection = 0;

        for (int i = 0; i < N; i++) {
            stringBooleanMap.put(br.readLine(), false);
        }

        for (int i = 0; i < M; i++) {
            String person = br.readLine();

            if (stringBooleanMap.containsKey(person)) {
                stringBooleanMap.put(person, true);
                intersection++;
            }
        }

        sb.append(intersection)
                .append("\n");

        for (Entry<String, Boolean> el : stringBooleanMap.entrySet()) {
            if (el.getValue()) {
                sb.append(el.getKey())
                        .append("\n");
            }
        }

        System.out.print(sb);
    }
}
