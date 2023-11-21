import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        boolean[] primeNumbers = new boolean[1_000_001];
        primeNumbers[0] = primeNumbers[1] = true;

        for (int i = 2; i < primeNumbers.length; i++) {
            if (isPrime(i)) {
                primeNumbers[i] = true;
            }
        }

        for (int i = 0; i < T; i++) {
            sb.append(countGoldbachPartition(Integer.parseInt(br.readLine()), primeNumbers))
                    .append("\n");
        }

        System.out.print(sb);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return number < 2 ? false : true;
    }

    private static int countGoldbachPartition(int even, boolean[] primeNumbers) {
        int count = 0;

        for (int i = 2; i <= even / 2; i++) {
            int diff = even - i;
            
            if (primeNumbers[i] && primeNumbers[diff]) {
                count++;
            }
        }

        return count;
    }
}
