import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        final int T = Integer.parseInt(br.readLine());
        int[] nums = new int[10];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = 0;

            while (st.hasMoreTokens()) {
                nums[idx++] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);
            double sum = 0;

            for (int j = 1; j < 9; j++) {
                sum += nums[j];
            }

            sb.append("#" + (i + 1) + " " + Math.round(sum / 8) + "\n");
        }

        System.out.print(sb);
    }
}


