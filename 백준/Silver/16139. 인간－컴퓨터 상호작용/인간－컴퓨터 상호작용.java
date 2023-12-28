import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        final String S = br.readLine();
        final int LENGTH = S.length();
        int q = Integer.parseInt(br.readLine());
        final int NUMBER_OF_LETTERS = 26;

        int[][] sum = new int[NUMBER_OF_LETTERS][LENGTH + 1];

        for (int i = 0; i < NUMBER_OF_LETTERS; i++) {
            for (int j = 1; j < LENGTH + 1; j++) {
                if (S.charAt(j - 1) == 'a' + i) {
                    sum[i][j] = sum[i][j - 1] + 1;
                } else {
                    sum[i][j] = sum[i][j - 1];
                }
            }
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            char target = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int alphabet = target - 'a';

            sb.append(sum[alphabet][end + 1] - sum[alphabet][start])
                    .append("\n");
        }

        System.out.print(sb);
    }
}
