import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        List<String> week = Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
        final int IDX_OF_SUN = week.indexOf("SUN");

        for (int i = 0; i < T; i++) {
            int targetIdx = week.indexOf(br.readLine());
            int res = targetIdx == IDX_OF_SUN ? IDX_OF_SUN + 1 : IDX_OF_SUN - targetIdx;

            sb.append("#")
                    .append(i + 1)
                    .append(" ")
                    .append(res)
                    .append("\n");
        }

        System.out.print(sb);
    }
}
