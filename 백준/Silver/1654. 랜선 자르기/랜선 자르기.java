import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        // K <= N
        final int K = Integer.parseInt(input[0]);
        final int N = Integer.parseInt(input[1]);
        int[] cables = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, cables[i]);
        }

        System.out.print(calcMax(N, cables, max));
    }

    private static long calcMax(final int N, int[] cables, long max) {
        long min = 1;

        while (min <= max) {
            long count = 0;
            long mid = (min + max) / 2;

            for (int el : cables) {
                count += (el / mid);
            }

            if (count >= N) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return max;
    }
}
