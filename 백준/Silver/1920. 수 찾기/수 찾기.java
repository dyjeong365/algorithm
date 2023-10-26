import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Map<String, String> A = new HashMap<>();

        final int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A.put(st.nextToken(), "1");
        }

        final int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            String input = st.nextToken();
            sb.append(A.containsKey(input) ? A.get(input) : "0")
                    .append("\n");
        }

        System.out.print(sb);
    }
}
