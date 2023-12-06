import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int MAX = 1000;
        int[] time = new int[MAX + 1];

        for (int i = 0; i < N; i++) {
            time[Integer.parseInt(st.nextToken())]++;
        }

        int prev = 0;
        int sum = 0;

        for (int i = 1; i <= MAX; i++) {
            while (time[i]-- > 0) {
                sum += (i + prev);
                prev += i;
            }
        }

        System.out.print(sum);
    }
}
