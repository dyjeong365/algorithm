import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int A1 = Integer.parseInt(st.nextToken());
        final int A0 = Integer.parseInt(st.nextToken());

        final int C = Integer.parseInt(br.readLine());
        final int N0 = Integer.parseInt(br.readLine());

        for (int n = N0; n <= 100; n++) {
            if (A1 * n + A0 > C * n || A1 > C) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
