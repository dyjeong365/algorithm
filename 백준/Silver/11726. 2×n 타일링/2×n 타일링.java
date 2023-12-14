import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        final int MAX = 1000;
        long[] fibonacci = new long[MAX + 1];

        fibonacci[1] = 1;
        fibonacci[2] = 2;

        for (int i = 3; i <= n; i++) {
            fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1]) % 10_007;
        }

        System.out.println(fibonacci[n]);
    }
}
