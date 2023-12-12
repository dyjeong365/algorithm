import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        final int MAX = 1000;
        long[] sequence = new long[MAX + 1];
        sequence[1] = 1;
        sequence[2] = 3;

        for (int i = 3; i <= MAX; i++) {
            sequence[i] =
                    ((sequence[i - 2] * 2) + (sequence[i - 1])) % 10_007;
        }

        System.out.print(sequence[n]);
    }
}
