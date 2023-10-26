import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        final int FIRST = Integer.parseInt(input[0]);
        final int SECOND = Integer.parseInt(input[1]);
        final int GCD = gcd(FIRST, SECOND);

        sb.append(GCD)
                .append("\n")
                .append(lcm(FIRST, SECOND, GCD));

        System.out.print(sb);
    }

    private static int gcd(int first, int second) {
        final int MIN = Math.min(first, second);

        for (int i = MIN; i > 1; i--) {
            if (first % i == 0 && second % i == 0) return i;
        }

        return 1;
    }

    private static int lcm(int first, int second, int gcd) {
        return gcd * (first / gcd) * (second / gcd);
    }
}
