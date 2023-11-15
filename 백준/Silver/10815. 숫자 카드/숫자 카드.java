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
        Map<Integer, Integer> cards = new HashMap<>();
        final int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            cards.put(Integer.parseInt(st.nextToken()), 1);
        }

        final int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int cardNumber = Integer.parseInt(st.nextToken());

            sb.append(cards.containsKey(cardNumber) ? 1 : 0)
                    .append(" ");
        }

        System.out.print(sb);
    }
}
