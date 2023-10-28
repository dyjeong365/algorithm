import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] plusResults = new int[10_000_001];
        int[] minusResults = new int[10_000_001];

        final int N = Integer.parseInt(br.readLine());
        String[] nCards = br.readLine().split(" ");

        for (var el : nCards) {
            int idx = Integer.parseInt(el);

            if (el.contains("-")) minusResults[-idx]++;
            else plusResults[idx]++;
        }

        final int M = Integer.parseInt(br.readLine());
        String[] mCards = br.readLine().split(" ");

        for (var el : mCards) {
            int idx = Integer.parseInt(el);

            if (el.contains("-")) sb.append(minusResults[-idx]);
            else sb.append(plusResults[idx]);

            sb.append(" ");
        }

        System.out.print(sb);
    }
}
