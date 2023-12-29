import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        final int MAX = 20;
        result = new int[MAX + 1][MAX + 1][MAX + 1];

        while (true) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 && a == b && a == c) {
                break;
            }

            sb.append(String.format("w(%d, %d, %d) = %d", a, b, c, w(a, b, c))).append("\n");
        }

        System.out.print(sb);
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            result[20][20][20] = w(20, 20, 20);
            
            return result[20][20][20];
        }

        if (result[a][b][c] != 0) {
            return result[a][b][c];
        }

        if (a < b && b < c) {
            result[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);

            return result[a][b][c];
        }

        result[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);

        return result[a][b][c];
    }
}
