import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            final int k = Integer.parseInt(br.readLine());
            final int n = Integer.parseInt(br.readLine());

            sb.append(outputResidentCount(k, n))
                    .append("\n");
        }

        System.out.print(sb);
    }

    private static int outputResidentCount(int k, int n) {
        int[][] apartment = new int[k + 1][n];

        for (int i = 0; i < n; i++) {
            apartment[0][i] = i + 1;
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;

                for (int l = 0; l <= j; l++) {
                    sum += apartment[i - 1][l];
                }

                apartment[i][j] = sum;
            }
        }

        return apartment[k][n - 1];
    }
}
