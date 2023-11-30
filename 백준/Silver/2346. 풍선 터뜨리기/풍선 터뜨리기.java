import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] move = new int[N];
        List<Integer> balloons = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            move[i] = Integer.parseInt(st.nextToken());
            balloons.add(i + 1);
        }

        int idx = 0;

        while (true) {
            int cur = balloons.get(idx);

            sb.append(cur).append(" ");
            balloons.remove(idx);

            if (balloons.isEmpty()) {
                break;
            }

            int distance = move[cur - 1];

            if (distance > 0) {
                distance--;
            }

            final int SIZE = balloons.size();
            idx = (idx + distance) % SIZE;

            if (idx < 0) {
                idx += SIZE;
            }
        }

        System.out.print(sb);
    }
}
