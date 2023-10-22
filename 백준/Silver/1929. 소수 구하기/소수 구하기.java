import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        final int M = Integer.parseInt(input[0]);
        final int N = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) sb.append(i + "\n");
        }

        System.out.print(sb);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return number == 1 ? false : true;
    }
}
