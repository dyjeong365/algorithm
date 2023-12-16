import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());

        int[] sequence = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            int input = Integer.parseInt(st.nextToken());
            sequence[i] = sequence[i - 1] + input;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());

            sum = sequence[last] - sequence[first - 1];
            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
