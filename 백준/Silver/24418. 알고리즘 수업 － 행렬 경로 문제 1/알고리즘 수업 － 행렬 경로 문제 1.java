import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int countOfCode1 = 0;
    static int countOfCode2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[][] matrix = new int[n + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j < n + 1; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        matrixPathRec(matrix, n, n);
        matrixPathDp(matrix, n);

        sb
                .append(countOfCode1)
                .append(" ")
                .append(countOfCode2);

        System.out.print(sb);
    }

    private static int matrixPathRec(int[][] matrix, int x, int y) {
        if (x == 0 || y == 0) {
            countOfCode1++;

            return 0;
        } else {
            return matrix[x][y]
                    + Integer.max(matrixPathRec(matrix, x - 1, y), matrixPathRec(matrix, x, y - 1));
        }
    }

    private static int matrixPathDp(int[][] matrix, int n) {
        int[][] d = new int[n + 1][n + 1];

        for (int x = 1; x < n + 1; x++) {
            for (int y = 1; y < n + 1; y++) {
                d[x][y] = matrix[x][y]
                        + Integer.max(d[x - 1][y], d[x][y - 1]);
                countOfCode2++;
            }
        }

        return d[n][n];
    }
}
