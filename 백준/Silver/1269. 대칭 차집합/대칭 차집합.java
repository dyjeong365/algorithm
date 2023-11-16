import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = br.readLine();
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        int answer = 0;

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            stringBooleanMap.put(st.nextToken(), true);
        }

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            String key = st.nextToken();

            stringBooleanMap.put(key, stringBooleanMap.containsKey(key) ? false : true);
        }

        for (Boolean hasNotDuplicated : stringBooleanMap.values()) {
            if (hasNotDuplicated) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}
