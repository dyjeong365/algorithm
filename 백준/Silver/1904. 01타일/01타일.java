import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final int MAX = 1_000_001;

        int[] sequence = new int[MAX];
        sequence[1] = 1;
        sequence[2] = 2;

        for (int i = 3; i < MAX; i++) {
            sequence[i] = (sequence[i - 2] + sequence[i - 1]) % 15746;
        }

        System.out.println(sequence[N]);
    }
}
