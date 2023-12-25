import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int K = Integer.parseInt(st.nextToken());
        int[] temperatures = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            int input = Integer.parseInt(st.nextToken());
            temperatures[i] = temperatures[i - 1] + input;
        }

        int max = Integer.MIN_VALUE;

        for (int i = K; i < N + 1; i++) {
            max = Integer.max(max, (temperatures[i] - temperatures[i - K]));
        }

        System.out.print(max);
    }
}
