import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Map<String, Boolean> remainingWorkers = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            String[] log = br.readLine().split(" ");
            String person = log[0];
            String state = log[1];

            if (state.equals("enter")) {
                remainingWorkers.put(person, true);
            } else if (state.equals("leave")) {
                remainingWorkers.put(person, false);
            }
        }

        for (Entry<String, Boolean> person : remainingWorkers.entrySet()) {
            if (person.getValue()) {
                sb.append(person.getKey())
                        .append("\n");
            }
        }

        System.out.print(sb);
    }
}
