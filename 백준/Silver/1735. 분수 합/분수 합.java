import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int NUMBER_OF_INPUT_FRACTIONS = 2;

        int[] numerator = new int[NUMBER_OF_INPUT_FRACTIONS];
        int[] denominator = new int[NUMBER_OF_INPUT_FRACTIONS];

        for (int i = 0; i < NUMBER_OF_INPUT_FRACTIONS; i++) {
            st = new StringTokenizer(br.readLine());
            numerator[i] = Integer.parseInt(st.nextToken());
            denominator[i] = Integer.parseInt(st.nextToken());
        }

        int denominatorOfResult = denominator[0] * denominator[1];
        int numeratorOfResult = numerator[0] * denominator[1] + numerator[1] * denominator[0];
        int gcd = gcd(denominatorOfResult, numeratorOfResult);

        denominatorOfResult /= gcd;
        numeratorOfResult /= gcd;

        sb.append(numeratorOfResult)
                .append(" ")
                .append(denominatorOfResult);

        System.out.print(sb);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
