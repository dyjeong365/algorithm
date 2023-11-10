import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);

        final int MIN = -999;
        final int MAX = 999;

        for (int x = MIN; x <= MAX; x++) {
            for (int y = MIN; y <= MAX; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    sb.append(x)
                            .append(" ")
                            .append(y);
                }
            }
        }

        System.out.println(sb);
    }
}
