import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine());
            int idx = 0;

            sb.append("#" + (i + 1) + "\n");

            while (idx < moneys.length) {
                sb.append(money / moneys[idx] + " ");

                money %= moneys[idx];
                idx++;
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}


