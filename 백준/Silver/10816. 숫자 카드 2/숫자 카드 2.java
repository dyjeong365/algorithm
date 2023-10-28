import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        final int N = Integer.parseInt(br.readLine());
        String[] nCards = br.readLine().split(" ");

        for (var el : nCards) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        final int M = Integer.parseInt(br.readLine());
        String[] mCards = br.readLine().split(" ");

        for (var el : mCards) {
            sb.append(map.containsKey(el) ? map.get(el) : 0)
                    .append(" ");
        }

        System.out.print(sb);
    }
}
