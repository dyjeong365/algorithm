import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int result = (a * b) / gcd(a, b);

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }

    private static int gcd(int a, int b) {
        int min = Integer.min(a, b);
        int result = 1;

        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                result *= i;
                break;
            }
        }

        return result;
    }
}
