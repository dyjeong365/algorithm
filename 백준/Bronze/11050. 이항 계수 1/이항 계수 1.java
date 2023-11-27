import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        final int N = Integer.parseInt(input[0]);
        final int K = Integer.parseInt(input[1]);

        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
    }

    private static long factorial(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * factorial(--num);
    }
}
