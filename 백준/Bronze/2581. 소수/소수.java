import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int M = Integer.parseInt(br.readLine());
        final int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int min = 0;

        for (int i = N; i >= M; i--) {
            if (isPrime(i)) {
                min = i;
                sum += i;
            }
        }

        if (min == 0 && sum == 0) sb.append("-1");
        else sb.append(sum + "\n" + min);

        System.out.println(sb);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return number == 1 ? false : true;
    }
}
