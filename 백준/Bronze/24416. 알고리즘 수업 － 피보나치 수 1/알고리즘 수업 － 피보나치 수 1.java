import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int fibCount = 0;
    static int fibonacciCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] f = new int[41];

        fib(n);
        fibonacci(n, f);

        sb.append(fibCount)
                .append(" ")
                .append(fibonacciCount);

        System.out.print(sb);
    }

    private static int fib(int n) {

        if (n <= 2) {
            fibCount++;
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    private static int fibonacci(int n, int[] f) {
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibonacciCount++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}
