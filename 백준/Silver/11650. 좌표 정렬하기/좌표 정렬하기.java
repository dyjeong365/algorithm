import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < coordinate[i].length; j++) {
                coordinate[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(coordinate, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int[] el : coordinate) {
            sb.append(el[0])
                    .append(" ")
                    .append(el[1])
                    .append("\n");
        }

        System.out.print(sb);
    }
}
