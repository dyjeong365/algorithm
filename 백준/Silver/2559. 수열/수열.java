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
        int[] temperatures = new int[N];
        int lengthOfSum = N - K + 1;
        int[] sum = new int[lengthOfSum];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            temperatures[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < lengthOfSum; i++) {
            for (int j = i; j < i + K; j++) {
                sum[i] += temperatures[j];
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < lengthOfSum; i++) {
            max = Integer.max(max, sum[i]);
        }

        System.out.print(max);
    }
}
