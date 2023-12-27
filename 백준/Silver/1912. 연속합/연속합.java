import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];
        int[] sum = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        int max = sum[0] = sequence[0];

        for (int i = 1; i < n; i++) {
            sum[i] = Integer.max(sequence[i], sum[i - 1] + sequence[i]);
            max = Integer.max(max, sum[i]);
        }

        System.out.print(max);
    }
}
