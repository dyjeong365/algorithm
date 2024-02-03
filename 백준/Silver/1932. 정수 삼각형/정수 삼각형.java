import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int size;
    static int[][] triangle;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        size = Integer.parseInt(br.readLine());
        triangle = new int[size][size];
        dp = new int[size][size];

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[size - 1] = Arrays.copyOf(triangle[size - 1], size);

        System.out.print(findMax(0, 0));
    }

    private static int findMax(int depth, int idx) {
        if (depth == size - 1) {
            return dp[depth][idx];
        }

        if (dp[depth][idx] == 0) {
            dp[depth][idx] =
                    // 밑에서부터 올라오면서 최댓값을 찾는 과정
                    Math.max
                            (

                                    findMax(depth + 1, idx),
                                    findMax(depth + 1, idx + 1)
                            )
                            + triangle[depth][idx];
        }

        return dp[depth][idx];
    }
}
