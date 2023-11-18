import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int n = 0;
        int gcd = 0;
        int[] streetTrees = new int[N];

        for (int i = 0; i < N; i++) {
            streetTrees[i] = Integer.parseInt(br.readLine());

            if (i > 0) {
                int distance = streetTrees[i] - streetTrees[i - 1];
                gcd = gcd(distance, gcd);
            }
        }

        n = ((streetTrees[N - 1] - streetTrees[0]) / gcd) + 1;
        System.out.println(n - streetTrees.length);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
