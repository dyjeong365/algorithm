import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final long T = Long.parseLong(br.readLine());

        for (long i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            long answer = findMore(n);

            sb.append(answer)
                    .append("\n");
        }

        System.out.print(sb);
    }

    private static long findMore(long n) {
        for (long i = n; i < Long.MAX_VALUE; i++) {

            if (isPrime(i)) {
                return i;
            }
        }

        return 0;
    }

    private static boolean isPrime(long i) {
        if (i < 2) {
            return false;
        }

        for (long j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }
}
