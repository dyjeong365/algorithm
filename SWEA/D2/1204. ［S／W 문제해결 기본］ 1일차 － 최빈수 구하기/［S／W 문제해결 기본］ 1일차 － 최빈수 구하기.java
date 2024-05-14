import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            int[] scores = new int[101];
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                scores[Integer.parseInt(st.nextToken())]++;
            }

            int max = -1;

            for (int cnt : scores) {
                max = Math.max(max, cnt);
            }

            int result = 0;

            for (int j = 100; j >= 0; j--) {
                if (max == scores[j]) {
                    result = j;
                    break;
                }
            }

            sb.append("#" + num + " " + result + "\n");
        }

        System.out.print(sb);
    }
}


