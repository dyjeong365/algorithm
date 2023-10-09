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
                int result = c / changeAmount[j];
                sb.append(result);

                if (j != 3) sb.append(" ");

                c -= (result * changeAmount[j]);
            }

            System.out.println(sb);
        }
    }
}
