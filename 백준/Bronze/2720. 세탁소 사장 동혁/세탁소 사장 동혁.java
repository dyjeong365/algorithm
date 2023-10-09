import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        int[] changeAmount = {25, 10, 5, 1};

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            int c = Integer.parseInt(br.readLine());

            for (int j = 0; j < changeAmount.length; j++) {
                sb.append(c / changeAmount[j]);

                if (j != changeAmount.length) sb.append(" ");

                c %= changeAmount[j];
            }

            System.out.println(sb);
        }
    }
}
